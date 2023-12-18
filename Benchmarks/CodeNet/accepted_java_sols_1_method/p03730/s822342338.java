import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

//   String nyuA=sc.nextLine();
  // String nyuB=sc.nextLine();
 
     String[] O=sc.nextLine().split(" ");
   //  String[] E=sc.nextLine().split("");

//int n=Integer.parseInt(nyuA);

int A=Integer.parseInt(O[0]);
int B=Integer.parseInt(O[1]);
int C=Integer.parseInt(O[2]);

int flag=0;
for(int i=A;i<=A*B;i+=A){
if(i%B==C){
flag=1;
break;
}
}
if(flag==1)
System.out.println("YES");
else
System.out.println("NO");

//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);


	}
}