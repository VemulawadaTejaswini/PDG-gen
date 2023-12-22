import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

//   String nyuA=sc.nextLine();
  // String nyuB=sc.nextLine();
 
     String[] s=sc.nextLine().split(" ");
     String[] e=sc.nextLine().split(" ");

//int n=Integer.parseInt(nyuA);

int N=Integer.parseInt(s[0]);
int K=Integer.parseInt(s[1]);

ArrayList<Integer> list=new ArrayList<>();
for(String temp:e){
list.add(Integer.parseInt(temp));
}
Collections.sort(list);
int res=0;
for(int i=0;i<K;i++){
res+=list.get(list.size()-1-i);
}

System.out.println(res);

//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);


	}
}