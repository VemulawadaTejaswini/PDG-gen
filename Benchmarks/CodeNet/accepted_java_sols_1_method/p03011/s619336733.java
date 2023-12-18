import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        int max = P;
        if(max < R){
            max = R;
        }
        if(max < Q){
            max = Q;
        }
        System.out.println(P + Q + R - max);
        
    }
}
