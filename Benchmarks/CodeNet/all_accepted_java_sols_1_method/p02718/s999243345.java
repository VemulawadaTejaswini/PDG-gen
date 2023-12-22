import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[(int)(N)];
        int a = 0;
        for(int i = 0 ; i < N ; i++){
                A[i] = sc.nextInt();
                a = a + A[i];
        }
       
        int[] B = new int[(int)(M)];
        int h = 0;
        for(int i = 0; i < M;i++){
            B[i] = 0;
            for(int n = 0; n < N ; n++){
                if(B[i] < A[n]){
                    B[i] = A[n];
                    h = n;
                }
            }
            A[h] = 0;
        }
        

        if((double)a/(4.0*M) > (double)B[M-1]){
        System.out.print("No");
        }else{
            System.out.print("Yes");
            }
    }
}
