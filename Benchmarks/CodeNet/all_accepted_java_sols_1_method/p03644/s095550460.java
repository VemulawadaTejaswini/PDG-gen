import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
  // String nyuB=sc.nextLine();
 
  //   String[] s=sc.nextLine().split(" ");
//     String[] e=sc.nextLine().split(" ");

int n=Integer.parseInt(nyuA);

//int N=Integer.parseInt(s[0]);
//int K=Integer.parseInt(s[1]);
int max=0;
int res=0;
for(int i=1;i<=n;i++){
int temp=i;
int count=0;
while(true){
if(temp%2!=0){


if(count>max){
max=count;
res=i;
//System.out.println(count+"--"+res);
}
break;
}//if
temp/=2;
count++;

}//while

}

if(res==0)res=1;

System.out.println(res);

//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);


	}
}