import java.util.Scanner;

public class Main
{
    public  static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;
        int arr[] = new int[M];
        for(int i=0;i<M;i++)
        {
            arr[i] = sc.nextInt();
            sum = sum+arr[i];
        }

        if(N-sum>=0)
        {System.out.print((N-sum));}
        else
        {System.out.print(-1);}


    }
}
