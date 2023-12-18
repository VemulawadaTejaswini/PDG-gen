import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
      String[] t=sc.nextLine().split(" ");
 
//    String nyuA=sc.nextLine();
 //  String nyuB=sc.nextLine();

//int n=Integer.parseInt(nyu);

int N=Integer.parseInt(t[0]);
int K=Integer.parseInt(t[1]);

//Queue<String> qA = new ArrayDeque<>();

//System.out.println(pre.toUpperCase());

long data=(long)K;

for(int i=0;i<N-1;i++){
data*=(long)(K-1);
}
System.out.println(data);
	}
}