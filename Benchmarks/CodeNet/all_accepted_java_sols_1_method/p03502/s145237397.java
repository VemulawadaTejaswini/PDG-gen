import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String ans = "No";
        int n = sc.nextInt();
        int m = n, l = 0;
        while(m > 0){
            l += m - m / 10 * 10;
            m /= 10;
        }
        if(n % l == 0) ans = "Yes";
        System.out.println(ans);
    }
}