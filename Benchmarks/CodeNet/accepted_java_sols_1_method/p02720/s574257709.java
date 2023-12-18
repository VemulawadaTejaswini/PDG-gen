import java.util.*;
import java.util.Map.Entry;
 
class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   	 static List<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
//	 static int mod = 998244353;
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int K = sc.nextInt();
	        int i=0;
			LinkedList<Long> queue = new LinkedList<Long>();
			queue.add(1l);
			queue.add(2l);
			queue.add(3l);
			queue.add(4l);
			queue.add(5l);
			queue.add(6l);
			queue.add(7l);
			queue.add(8l);
			queue.add(9l);
	        while(i<K-1) {
	        	long node = queue.poll();
	        	i++;
	        	if(node%10==0) {
	        		queue.add(node*10);
	        		queue.add(node*10+1);
	        	} else if(node%10==9) {
	        		queue.add(node*10+8);
	        		queue.add(node*10+9);	        		
	        	} else {
	        		queue.add(node*10+(node%10)-1);
	        		queue.add(node*10+(node%10));
	        		queue.add(node*10+(node%10)+1);
	        	}
	        }
        	long ans = queue.poll();
	        		
	        System.out.println(ans);
	        	        	        
	 }
}