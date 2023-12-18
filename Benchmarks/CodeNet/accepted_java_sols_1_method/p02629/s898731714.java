import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); String s = "";
        while (n > 0) {
            int mod = (int) (n % 26 + 96);
            n -= (n % 26 == 0 ? 26 : n % 26);
            if (mod == 96) mod = 122;
            s = (char) mod + s;
            n /= 26;
        }
        System.out.println(s);
    }


}