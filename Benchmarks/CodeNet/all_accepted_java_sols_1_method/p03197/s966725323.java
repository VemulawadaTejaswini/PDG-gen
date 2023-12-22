import java.util.*;

public class Main{
    static int H,W,A,B;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++)
            a[i] = sc.nextInt();

        for(int i = 0; i < N; i++){
            if(a[i]%2 != 0){
                System.out.println("first");
                return;
            }
        }
        System.out.println("second");
    }
}