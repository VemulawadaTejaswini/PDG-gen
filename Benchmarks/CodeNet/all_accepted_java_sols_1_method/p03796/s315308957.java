import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
  // String nyuB=sc.nextLine();
 
   //  String[] S=sc.nextLine().split(" ");

int n=Integer.parseInt(nyuA);

//int N=Integer.parseInt(S[0]);
//int M=Integer.parseInt(S[1]);

//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);

long res=1;
long war=1000000007;
for(int i=1;i<=n;i++){
res*=i;
res%=war;
}


System.out.println(res);


	}
}