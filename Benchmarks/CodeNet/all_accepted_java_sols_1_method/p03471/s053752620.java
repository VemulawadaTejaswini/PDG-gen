import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int y10000 = -1;
        int y5000 = -1;
        int y1000 = -1;
        for(int i=0;i<=N;i++){
            for(int j=0;j<=N-i;j++){
                if(10000*i+5000*j+1000*(N-i-j) == Y){
                    y10000 = i;
                    y5000 = j;
                    y1000 = N-i-j;
                    break;
                }
            }
        }
        System.out.println(y10000+" "+y5000+" "+y1000);
    }
}