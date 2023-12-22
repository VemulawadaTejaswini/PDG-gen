import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();
        for (int i=0;i<N+1;i++){
            for (int j=0;j<N+1-i;j++){
                if (10000*i+5000*j+1000*(N-i-j) == Y){
                    System.out.println(i+" "+j+" "+ (N-i-j));
                    System.exit(0);
                }
            }
        }
        System.out.println(-1+" "+-1+" "+ -1);
    }
}