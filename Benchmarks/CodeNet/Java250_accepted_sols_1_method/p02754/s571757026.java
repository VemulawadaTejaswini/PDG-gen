/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;



public class Main {
	public static void main (String[] args)throws IOException {
// 		System.out.println("GfG!");
// Scanner sc = new Scanner(System.in);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s[]= br.readLine().split(" ");

long  n= Long.parseLong(s[0]);
long a=Long.parseLong(s[1]);
long b= Long.parseLong(s[2]);
if(a==0 && b==0){
    System.out.println(0);
}
else{
long sum= a+b;
sum=n%sum;
if(sum>a)
sum=a;

long x= n/(a+b);

System.out.println(x*a+sum);
}
	}
}