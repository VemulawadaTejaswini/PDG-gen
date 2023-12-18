import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public Main() {
		Scanner scan = new Scanner(System.in);
		
		HashMap<Integer, Island> islandMap = new HashMap<Integer, Island>();
		int islandNum = scan.nextInt();
		for(int i = 0; i < islandNum+1; i++){
			islandMap.put(i, new Island(0));
		}
		
		while(scan.hasNext()){
			int a = scan.nextInt();
			if(a == 0) break;
			int b = scan.nextInt();
			int c = scan.nextInt();

			islandMap.get(b).cost = c;
			islandMap.get(a).addChild(islandMap.get(b));
		}
		
//		System.out.println(rec(islandMap.get(1))-maxCost);
	}
	
//	public int maxCost = 0;
//	public int rec(Island island){
//		if(island.hasChildren()){
//			int sumCost = 0;
//			for (Island child : island.children) {
//				sumCost = sumCost + rec(child);
//			}
//			
//			if(sumCost == 0){
//				if(maxCost < island.cost) maxCost = island.cost;
//				return island.cost*2;
//			}else{
//				return sumCost + island.cost;
//			}
//		}else{
//			return 0;
//		}
//	}
	
	public class Island{
		private ArrayList<Island> children = new ArrayList<Island>();
		int cost = 0;
		
		public Island(int c) {
			cost = c;
		}
		
		public void addChild(Island i){
			children.add(i);
		}
		
		public Boolean hasChildren(){
			return (children.size() == 0)? false:true;
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}
}