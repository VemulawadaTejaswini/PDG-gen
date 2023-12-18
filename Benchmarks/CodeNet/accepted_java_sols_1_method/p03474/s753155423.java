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

//int N=Integer.parseInt(s[0]);
int A=Integer.parseInt(s[0]);
int B=Integer.parseInt(s[1]);

String[] S=sc.nextLine().split("-");
if(S.length!=2)
System.out.println("No");
else{
try{
int mae=Integer.parseInt(S[0]);
int usi=Integer.parseInt(S[1]);
if(S[0].length()==A && S[1].length()==B){
System.out.println("Yes");
}else{
System.out.println("No");
}
}catch(Exception e){
System.out.println("No");
}

}


}

}

