import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

//   String nyuA=sc.nextLine();
  // String nyuB=sc.nextLine();
 
    String[] s=sc.nextLine().split(" ");
//     String[] e=sc.nextLine().split(" ");

//int n=Integer.parseInt(nyuA);

int A=Integer.parseInt(s[0]);
int B=Integer.parseInt(s[1]);
int C=Integer.parseInt(s[2]);
int D=Integer.parseInt(s[3]);

int[] num=new int[105];

for(int i=0;i<num.length;i++){
if(A<=i && i<B)num[i]++;
if(C<=i && i<D)num[i]++;
}
int res=0;
for(int i=0;i<num.length;i++){
if(num[i]==2)res++;
}

System.out.println(res);

//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);


	}
}