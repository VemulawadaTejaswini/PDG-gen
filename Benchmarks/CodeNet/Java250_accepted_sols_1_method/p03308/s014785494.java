import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static long[] list=new long[87];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
   
int N=Integer.parseInt(nyuA);

String[] data=sc.nextLine().split(" ");

int[] num=new int[data.length];

for(int i=0;i<data.length;i++){
num[i]=Integer.parseInt(data[i]);
}
Arrays.sort(num);


System.out.println(num[num.length-1]-num[0]);

}

}

