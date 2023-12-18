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
 		System.out.println((n/x)*t);
 	}
 }