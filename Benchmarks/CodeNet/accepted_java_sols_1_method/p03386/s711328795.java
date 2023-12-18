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
int A=Integer.parseInt(s[0]);
int B=Integer.parseInt(s[1]);
int K=Integer.parseInt(s[2]);

TreeSet<Long> list=new TreeSet<>();
for(long i=A;i<=B;i++){
if(i<A+K)list.add(i);
if(i>B-K)list.add(i);

}
ArrayList<Long> set=new ArrayList<>(list);
for(Long temp:set)
System.out.println(temp);



}

}

