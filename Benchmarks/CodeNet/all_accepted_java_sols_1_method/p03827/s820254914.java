import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
  // String nyuB=sc.nextLine();
 
      String[] S=sc.nextLine().split("");

//int n=Integer.parseInt(nyu);

int N=Integer.parseInt(nyuA);
//int S=Integer.parseInt(nyuB);


//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);

//boolean[][] data=new boolean[H][W];
int count=0;
int max=0;
for(int i=0;i<N;i++){
if(S[i].equals("I"))count++;
else count--;
if(max<count)max=count;
}

System.out.println(max);

	}
}