import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt(),m=sc.nextInt();
	  List<List<Integer>> lists = new ArrayList<>();
	  for(int i=0;i<n;i++) {
		  List<Integer> l = new ArrayList<>();
		  lists.add(l);
	  }
	  for(int i=0;i<m;i++) {
		  int buff1=sc.nextInt()-1,buff2=sc.nextInt()-1;
		  lists.get(buff1).add(buff2);
		  lists.get(buff2).add(buff1);
	  }
	  int[] dist=new int[n];
	  Arrays.fill(dist, -1);
	  ArrayDeque<Integer> dq = new ArrayDeque<>();
	  dist[0]=0;
	  dq.add(0);
	  while (dq.size() > 0) {
	  	int p = dq.removeFirst();
		for (int i=0; i<lists.get(p).size(); i++) {
			if(dist[lists.get(p).get(i)]!=-1)continue;
			dist[lists.get(p).get(i)]=p+1;
			dq.add(lists.get(p).get(i));
		}
	  }
	  System.out.println("Yes");
	  for(int i=1;i<n;i++) {
	  	System.out.println(dist[i]);
	  }
  }
}