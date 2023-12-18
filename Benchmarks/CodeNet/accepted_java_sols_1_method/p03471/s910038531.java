import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), y = sc.nextInt() / 1000;
        int ans1 = -1, ans2 = -1, ans3 = -1;
        for(int i = 0; i <= n; i++)
            for(int j = 0;  j <= n - i; j++)
                if(9 * i + 4 * j + n == y){
                    ans1 = i;
                    ans2 = j; 
                    ans3 = n - i - j;
                }
        System.out.println(ans1 + " " + ans2 + " " + ans3);
    }
}