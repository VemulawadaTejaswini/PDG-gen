import java.util.HashMap;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N,Q;
		int[] card;
		ModularQuery mq;
		
		while(true){
			N = scan.nextInt();
			Q = scan.nextInt();
			if(N==0 && Q==0){
				break;
			}
			card = new int[N];
			for(int i=0;i<N;i++){
				card[i] = scan.nextInt();
			}
			mq = new ModularQuery(N,card);
			
			for(int i=0;i<Q;i++){
				System.out.println(mq.getRemainder(scan.nextInt()));
			}
		}
	}
}

class ModularQuery{
	int[] card;
	HashMap<Integer,Integer> map;
	int N;
	
	ModularQuery(int n,int[] c){
		N = n;
		card = c;
		map = new HashMap<Integer,Integer>();
	}
	
	public int getRemainder(int q){
		int rem = 0;
		
		if(map.containsKey(q)){
			rem = map.get(q);
		}else{
			rem = searchMaxRemainder(q);
		}
		
		return rem;
	}
	
	public int searchMaxRemainder(int q){
		int max = 0;
		
		for(int i=0;i<N;i++){
			max = Math.max(max,card[i]%q);
		}
		map.put(q,max);
		
		return max;
	}
}