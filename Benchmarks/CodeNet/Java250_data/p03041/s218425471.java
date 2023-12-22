import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int K=sc.nextInt();
        String S=sc.next();
        int p=S.charAt(K-1);
        char x=(char)(p+32);
System.out.print(S.substring(0,(K-1))+x+S.substring(K));
}
}
