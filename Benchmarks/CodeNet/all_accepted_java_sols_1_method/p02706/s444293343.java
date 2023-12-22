import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[(int)(M)];
        int a = 0;
        for(int i = 0 ; i < M ; i++){
                A[i] = sc.nextInt();
                a = a + A[i];
        }
        if(a > N){
            System.out.print(-1);
        }else{
            int b = N - a;
            System.out.print(b);
        }
     }
}