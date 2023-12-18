import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
 
 
public class Main{
     
	public static class Walk{
		int pos, time;

		public Walk(int pos, int time) {
			super();
			this.pos = pos;
			this.time = time;
		}
	}
	
    public static void main(String[] args){
    	final Scanner sc = new Scanner(System.in);
    	
    	final int N = sc.nextInt();
    	
    	int[] array = new int[N];
    	for(int i = 0; i < N; i++){
    		array[i] = sc.nextInt();
    	}
    	
    	int[] times = new int[N];
    	Arrays.fill(times, Integer.MAX_VALUE);
    	
    	LinkedList<Walk> queue = new LinkedList<Walk>();
    	queue.add(new Walk(0, 0));
    	
    	while(!queue.isEmpty()){
    		Walk walk = queue.poll();
    		
    		//System.out.println(walk.pos + " " + walk.time);
    		
    		if(times[Math.min(N - 1, walk.pos)] <= walk.time){
    			continue;
    		}
    		times[Math.min(N - 1, walk.pos)] = walk.time;
    		
    		int next = walk.pos + array[Math.min(N - 1, walk.pos)];
    		if(next != walk.pos){
    			queue.addFirst(new Walk(next, walk.time));
    		}else{
    			
    			if(walk.pos >= N - 1){
    				System.out.println(walk.time);
    				return;
    			}
    			
    			for(int i = 6; i >= 1; i--){
    				queue.addLast(new Walk(walk.pos + i, walk.time + 1));
    			}
    		}
    	}
    	
    }
     
}