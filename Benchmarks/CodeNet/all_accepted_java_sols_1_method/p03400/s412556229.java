import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static long[] list=new long[87];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
//  String nyuB=sc.nextLine(); 
 

   String[] s=sc.nextLine().split(" ");
 //    String[] t=sc.nextLine().split("");

int N=Integer.parseInt(nyuA);
int D=Integer.parseInt(s[0]);
int X=Integer.parseInt(s[1]);

int res=0;
for(int i=0;i<N;i++){
int temp=Integer.parseInt(sc.nextLine());

int count=0;

while(true){
if(count*temp+1<=D){
res++;
}else{
break;
}
count++;
}

}

System.out.println(res+X);



}

}

