import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception{
		Scanner cin= new Scanner(System.in);
		int a= cin.nextInt();
		int b= cin.nextInt();
		
		int L= 2*(a+b);
		int S= a*b;
		
		System.out.println(S+" "+L);
	}
}