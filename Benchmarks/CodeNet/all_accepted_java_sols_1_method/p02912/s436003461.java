import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        int m=sc.nextInt();
        long o=0;
      PriorityQueue<Long> a=new PriorityQueue<>(Collections.reverseOrder());
      for(int i=0;i<n;i++){
            long k=sc.nextLong();
        	a.add(k);
      }
      for(int j=0;j<m;j++){
      	long a_max=a.poll();
        a.add(a_max/2);
      }
      for(int i=0;i<n;i++){
                o+=a.poll();
            }
		System.out.println(o);
    }  

}