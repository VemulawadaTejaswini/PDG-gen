import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int N=scan.nextInt();
        int K=scan.nextInt();
        int[] l =new int[50];
        int sum=0;

        for(int i=0;i<N;i++)
        {
            l[i]=scan.nextInt();
        }

        for(int j=0;j<N-1;j++)
        {
            for(int k=N-1;k>j;k--)
            {
                if(l[k-1]>l[k]){
                    int tmp=l[k];
                    l[k]=l[k-1];
                    l[k-1]=tmp;
                }
            }
        }

        for(int a=N-1;a>=N-K;a--)
        {
            sum+=l[a];
        }

        System.out.println(sum);
    }
}
