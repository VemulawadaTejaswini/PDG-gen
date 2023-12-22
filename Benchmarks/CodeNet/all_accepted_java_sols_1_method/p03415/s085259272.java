//DiagonalString.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
        String s2=sc.next();
        String s3=sc.next();
        
        System.out.print(s1.charAt(0));
        System.out.print(s2.charAt(1));
        System.out.print(s3.charAt(2));

        sc.close();
    }
}