import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		  try(Scanner sc = new Scanner(System.in)) {
			  while(sc.hasNext()) {
				  int m=sc.nextInt();
				  int n=sc.nextInt();
				  if(m==0 && n==0) break;
				  String[] s=new String[n+1];
				  boolean[] tf=new boolean[n+1];
				  for(int i=1; i<=n; i++) {
					  tf[i]=true;
					  s[i]=sc.next();
					  if(i%3==0 && i%5!=0 && ! s[i].equals("Fizz")) {
						  tf[i]=false;
					  }
					  else if(i%3!=0 && i%5==0 && ! s[i].equals("Buzz")) {
						  tf[i]=false;
					  }
					  else if(i%3==0 && i%5==0 && ! s[i].equals("FizzBuzz")) {
						  tf[i]=false;
					  }
					  else if(i%3!=0 && i%5!=0 && ! s[i].equals("i")) {
						  tf[i]=false;
					  }
				  }
				  
				  Queue <Integer> queue;
				  queue=new LinkedList<>();
				  for(int i=1; i<=m; i++) {
					  queue.add(i);
				  }
				  
				  for(int i=1; i<=n; i++) {
					  int p=queue.remove();
					  if(tf[i]) {
						  queue.add(p);
					  }
				  }
				  int count=0;
				  boolean[] atf=new boolean[m+1];
				  while(! queue.isEmpty()) {
					  int ans=queue.remove();
					  atf[ans]=true;
				  }
				  for(int i=1; i<=m; i++){
					  if(atf[i]) {
						  if(count>0) System.out.print(" ");
						  System.out.print(i);
						  count++;
					  }
				  }
				  System.out.println();
				  
			  }
		}
	}
}
