import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int o=0;
        int n=sc.nextInt();
        int k=sc.nextInt();
      PriorityQueue<Integer> p=new PriorityQueue<>();
      	for(int i=0;i<n;i++){
    		p.offer(sc.nextInt());
		}
        for(int j=0;j<k;j++){
          	o+=p.poll();
    	}
      System.out.println(o);
    }
    
}