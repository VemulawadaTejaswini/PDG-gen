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

   String nyuA=sc.nextLine();


//int N=Integer.parseInt(nyuA);
int A=Integer.parseInt(s[0]);
int B=Integer.parseInt(s[1]);
int C=Integer.parseInt(s[2]);

int K=Integer.parseInt(nyuA);

int[] num={A,B,C};
Arrays.sort(num);


for(int i=0;i<K;i++){
num[2]*=2;
}
int res=0;
for(int i=0;i<num.length;i++){
res+=num[i];
}

System.out.println(res);



}

}

