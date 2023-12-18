import java.util.Scanner;

public class Main
{
    public static int N;
    public static int[] List=new int[100];
    public static int Count=0;

    public  static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        N=scan.nextInt();

        for(int k=0;k<N;k++)
        {
            List[k]=scan.nextInt();
        }

        BubbleSort();

        for(int n=0;n<N;n++)
        {
            if(n!=N-1)
                System.out.print(List[n]+" ");
            if(n==N-1)
                System.out.println(List[n]);
        }
        System.out.println(Count);

    }

    public static void BubbleSort()
    {
        for(int j=0;j<N;j++){
            for(int k=j+1;k<N;k++)
            {
                if(List[j]>List[k])
                {
                    int tmp=List[j];
                    List[j]=List[k];
                    List[k]=tmp;
                    Count++;
                }
            }
        }
    }

}