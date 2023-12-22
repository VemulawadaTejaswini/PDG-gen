import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((int)(n+Math.pow(n,2)+Math.pow(n,3)));
        sc.close();
    }
}