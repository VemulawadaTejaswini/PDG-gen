import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int ans = N * 2;
        if(N % 2 == 0){
            ans = N;
        }
        System.out.println(ans);
    }
}