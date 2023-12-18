import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int K=sc.nextInt();
        int A[]= new int[N];
        for (int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int B[]= new int[M];
        for (int i=0;i<M;i++){
            B[i]=sc.nextInt();
        }
        int sum=0;
        int count=0;
        for (int i=0;i<N;i++){
            if (sum<K&&K>A[i]) {
                sum += A[i];
                count++;
            }


        }
        for (int i=0;i<M;i++){
            if (sum<K&&K>B[i]) {
                sum += B[i];
                count++;
            }



        }
        System.out.println(count);
    }
}