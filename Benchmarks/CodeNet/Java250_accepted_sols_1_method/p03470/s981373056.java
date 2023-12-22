import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {

static long[] list=new long[87];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
 //  String nyuB=sc.nextLine();
 
//   String[] s=sc.nextLine().split(" ");
 //    String[] t=sc.nextLine().split("");

int N=Integer.parseInt(nyuA);
//int A=Integer.parseInt(s[0]);
//int B=Integer.parseInt(s[1]);

TreeSet<Integer> list=new TreeSet<>();
for(int i=0;i<N;i++){
list.add(Integer.parseInt(sc.nextLine()));
}
ArrayList<Integer> set=new ArrayList<>(list);


System.out.println(set.size());


}

}

