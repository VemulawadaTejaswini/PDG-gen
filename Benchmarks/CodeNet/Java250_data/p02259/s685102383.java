import java.util.Scanner;

public class Main
{
    public static int N;
    public static int[] List=new int[100];
    public static int Count=0;
    public static int flag=0;


    public  static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        N=scan.nextInt();

        for(int k=0;k<N;k++)
        {
            List[k]=scan.nextInt();
        }

        for(int k=0;k<N;k++)
        {
            BubbleSort(k);
        }

        for(int n=0;n<N;n++)
        {
            if(n!=N-1)
                System.out.print(List[n]+" ");
            if(n==N-1)
                System.out.println(List[n]);
        }
        System.out.println(Count);

    }

    public static void BubbleSort(int j)
    {
            for(int k=N-1;k>=1;k--)
            {
                flag=0;
                if(List[k]<List[k-1])
                {
                    int tmp=List[k];
                    List[k]=List[k-1];
                    List[k-1]=tmp;
                    flag=1;
                }
                if(flag==1) Count++;
            }
    }
}