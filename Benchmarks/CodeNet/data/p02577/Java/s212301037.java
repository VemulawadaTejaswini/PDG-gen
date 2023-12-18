import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static final int mod = 1000000007;

    public static void main(String[] args) {

        String  s = sc.next();
        char[] c = s.toCharArray();
        
        long ans = 0;
        
        for(int i =0; i<s.length(); i++)
        ans += c[i]-'0';
        
   System.out.println(ans%9==0?"Yes":"No");
        
       



    }
















    static int max(int a, int b)
    {
        return Math.max(a,b);
    }
    static int max(int a, int b, int c)
    {
        return Math.max(max(a,b), c);
    }
    static int max(int a, int b, int c, int d)
    {
        return Math.max(max(a,b), max(c,d));
    }

    static int min(int a, int b)
    {
        return Math.min(a, b);
    }

    static int min(int a, int b, int c )
    {
        return Math.min(a, min(b,c));
    }

    static int min(int a, int b, int c, int d )
    {
        return Math.min(min(a,d), min(b,c));
    }

    static boolean isPower(int a, int b)
    {
        double temp = Math.log(a)/Math.log(b);
        return temp == (int) temp;
    }
    static boolean isPrime(int n)
    {
        if(n==1) return false;
        if(n==2) return true;
        if(n%2==0) return false;

        if(n<9)return true;
        if(n%3==0) return false;

        int r = (int)Math.sqrt(n);

        for(int i = 5; i<=r; i +=6)
        {
            if(n%i==0) return false;
            if(n%(i+2)==0) return false;
        }
        return true;



    }
}
