import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count=0;


        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<N; i++) A[i]=sc.nextInt();

        for(int i=0;i<N;i++)
        {
            for(int k=0; k<N-i-1; k++)
            {
                if(A[k+1]<A[k])
                {
                    int c;
                    c=A[k+1]; A[k+1]=A[k]; A[k]=c;
                    count++;
                }
            }
        }

        for(int i=0; i<N-1; i++) System.out.printf("%d ",A[i]);
        System.out.printf("%d\n",A[N-1]);
        System.out.println(count);

        sc.close();
    }
}
