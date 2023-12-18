import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];
        int minj, i,j, count=0;
        for(i=0; i<N; i++) A[i] = sc.nextInt();
        boolean swapped;

        for(i=0; i<N; i++)
        {
            minj = i;
            swapped = false;

            for(j=i; j<N; j++)
            {
                if(A[j]<A[minj])
                {
                    minj=j;
                    swapped = true;
                }
            }
            if(swapped)
            {
                count++;
                int c;
                //System.out.printf("swapping %d and %d\n",A[i],A[minj]);
                c=A[i];
                A[i]=A[minj];
                A[minj]=c;
                //for(int m=0;m<N; m++) System.out.printf("%d ",A[m]);
                //System.out.printf("\n");
            }
        }

        for(i=0; i<N-1; i++) System.out.printf("%d ",A[i]);
        System.out.printf("%d\n",A[N-1]);
        System.out.println(count);

        sc.close();
    }
}
