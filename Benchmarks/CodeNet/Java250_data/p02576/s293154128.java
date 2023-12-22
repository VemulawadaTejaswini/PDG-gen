import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 public class Main
 {
 	public static void main(String[]args)
 	{
 		Scanner sc=new Scanner (System.in);
 		int n=sc.nextInt();
 		int x=sc.nextInt();
 		int t=sc.nextInt();
 		if(n%x==0)
 			System.out.println((n/x)*t);
 		else
 			System.out.println(((n/x)*t)+t);
 	}
 }