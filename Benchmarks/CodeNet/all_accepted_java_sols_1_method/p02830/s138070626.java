import  java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String s = sc.next();
        String t = sc.next();
        
        //char[] ans = new char[n*2];
        String ans = new String();
        
        for(int i = 0;i<n;i++)
        {
            ans += s.substring(i,i+1);
            ans += t.substring(i,i+1);
            //System.out.println(s.substring(i,i+1));
            //System.out.println(t.substring(i,i+1));
        }
        
        System.out.println(ans);
    }
}
