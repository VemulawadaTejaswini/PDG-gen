import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static long[] list=new long[87];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  // String nyuA=sc.nextLine();
//  String nyuB=sc.nextLine(); 
 

   String[] s=sc.nextLine().split(" ");
 //    String[] t=sc.nextLine().split("");

//int N=Integer.parseInt(nyuA);
int N=Integer.parseInt(s[0]);
int M=Integer.parseInt(s[1]);
int X=Integer.parseInt(s[2]);

int[] num=new int[N+1];

String[] te=sc.nextLine().split(" ");

for(int i=1;i<=M;i++){
int temp=Integer.parseInt(te[i-1]);

num[temp]=1;
}

int count=0;
int count2=0;
for(int i=Math.min(X,N);i<=Math.max(X,N);i++){
count+=num[i];
}
for(int i=0;i<=X;i++){
count2+=num[i];
}
System.out.println(Math.min(count,count2));



}

}

