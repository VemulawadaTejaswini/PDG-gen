import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static long[] list=new long[87];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
 //  String nyuB=sc.nextLine();
 
 //   String[] s=sc.nextLine().split(" ");
   //  String[] e=sc.nextLine().split(" ");

int N=Integer.parseInt(nyuA);

//int Y=Integer.parseInt(e[1]);
//int Z=Integer.parseInt(e[2]);

String[] Ns=nyuA.split("");
int shu=0;
for(String temp:Ns){
shu+=Integer.parseInt(temp);
}

if(N%shu==0)
System.out.println("Yes");
else
System.out.println("No");


}

}

