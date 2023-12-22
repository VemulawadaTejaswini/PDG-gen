import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int N = n;

        int S = 0;
        do{
            S += ( N - ((N / 10) * 10));
            N /= 10;
        }while(N > 0);

        String ans = (n % S == 0)? "Yes" : "No";

        System.out.println(ans);
    }
}