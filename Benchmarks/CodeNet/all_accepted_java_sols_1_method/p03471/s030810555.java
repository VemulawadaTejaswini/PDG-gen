import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int a = -1;
        int b = -1;
        int c = -1; 

        for(int i=0;i<=N;i++){
            for(int j=0;j<=N-i;j++){
                if(Y == (10000*i+5000*j+1000*(N-i-j))){
                    a = i;
                    b = j;
                    c = N-i-j;
                }
                
            }
        }
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c);
    }
}   