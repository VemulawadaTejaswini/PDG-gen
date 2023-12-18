import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static long[] list=new long[87];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

//   String nyuA=sc.nextLine();
 //  String nyuB=sc.nextLine();
 
   String[] s=sc.nextLine().split(" ");
 //    String[] t=sc.nextLine().split("");

//int N=Integer.parseInt(nyuA);
int A=Integer.parseInt(s[0]);
int B=Integer.parseInt(s[1]);

String C=s[0]+s[1];
int num=Integer.parseInt(C);
int hei=(int)Math.sqrt(num);
if(num==hei*hei)
System.out.println("Yes");
else
System.out.println("No");



}

}

