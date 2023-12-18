import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) throws IOException {
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  int m = in.nextInt();
	  int[][] pass = new int[n][n];
	  int[] sign = new int[n];
	  sign[0]=0;
	  for(int i=0; i<m; i++) {
		  int a = in.nextInt();
		  int b = in.nextInt();
		  pass[a-1][b-1]=1;
		  pass[b-1][a-1]=1;
	  }
	  Queue<Integer> queue = new LinkedList<Integer>();
	  for(int i=1; i<n; i++) {
		  if(pass[i][0]==1) {
			  sign[i]=1;
			  queue.add(i);
		  }
	  }
	  while(!queue.isEmpty()) {
		  int cur = queue.poll();
		  //System.out.println(cur);
		  for(int i=1; i<n; i++) {
			  if(pass[cur][i]==1 && sign[i]==0) {
				  sign[i]=cur+1;
				  queue.add(i);
			  }
		  }
	  }
	  for(int i=1; i<n; i++) {
		  if(sign[i]==0) {
			  System.out.println("No");
			  System.exit(0);
		  }
	  }
	  System.out.println("Yes");
	  for(int i=1; i<n; i++) {
		  System.out.println(sign[i]);
	  }
	  
	  
  }
}