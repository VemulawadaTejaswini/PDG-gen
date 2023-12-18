import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int tmp = 0;
        int num[] = new int[N];
        for(int i = 0 ; i < N ; i++)
            num[i] = sc.nextInt();
        for(int i = 0 ; i < N - 1; i++)
        {
            for(int j = N - 1 ; j > i ; j--)
            {
                if(num[j] < num[j - 1])
                {
                    tmp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = tmp;
                    count++;
                }
            }
        }
        for(int i = 0 ; i < N - 1 ; i++)
            System.out.print(num[i] + " ");
        System.out.println(num[N-1]);
        System.out.println(count);
    }
}
