
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		LinkedList<Rail> railList = new LinkedList<>();
		
		for(int i = 1; i <= n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int cost = sc.nextInt();
			int time = sc.nextInt();
			railList.add(new Rail(a, b, cost, time));
		}

		int k = sc.nextInt();
		
		for(int i = 0; i < k; i++){
			int p = sc.nextInt();
			int q = sc.nextInt();
			int r = sc.nextInt();

			LinkedList<Rail> railListTmp = new LinkedList<>(railList);
			if(r == 0){
				System.out.println(getCost(railListTmp, p, q));	
			}
			if(r == 1){
				System.out.println(getTime(railListTmp, p, q));	
			}
			
		}
	}
	
	private static int getCost(LinkedList<Rail> railList, int p, int q){
		int min = 9999;
		int cost = 0;
		
		LinkedList<Rail> railListTmp = new LinkedList<>();
		while(!railList.isEmpty()){
			Rail rail = railList.pop();
			if((rail.getA() == p && rail.getB() == q) || (rail.getA() == q && rail.getB() == p)){
				cost = rail.getCost();
			}else if(rail.getA() == p){
				LinkedList<Rail> railListTmp2 = new LinkedList<>();
				railListTmp2.addAll(railList);
				railListTmp2.addAll(railListTmp);
				cost = rail.getCost() + getCost(railListTmp2, rail.getB(), q);
			}else if(rail.getB() == p){
				LinkedList<Rail> railListTmp2 = new LinkedList<>();
				railListTmp2.addAll(railList);
				railListTmp2.addAll(railListTmp);
				cost = rail.getCost() + getCost(railListTmp2, rail.getA(), q);
			}else{
				railListTmp.push(rail);
				continue;
			}
			
			if(min > cost){
				min = cost;
			}
		}
		return min;
	}

	
	private static int getTime(LinkedList<Rail> railList, int p, int q){
		int min = 9999;
		int time = 0;
		
		LinkedList<Rail> railListTmp = new LinkedList<>();
		while(!railList.isEmpty()){
			Rail rail = railList.pop();
			if((rail.getA() == p && rail.getB() == q) || (rail.getA() == q && rail.getB() == p)){
				time = rail.getTime();
			}else if(rail.getA() == p){
				LinkedList<Rail> railListTmp2 = new LinkedList<>();
				railListTmp2.addAll(railList);
				railListTmp2.addAll(railListTmp);
				time = rail.getTime() + getTime(railListTmp2, rail.getB(), q);
			}else if(rail.getB() == p){
				LinkedList<Rail> railListTmp2 = new LinkedList<>();
				railListTmp2.addAll(railList);
				railListTmp2.addAll(railListTmp);
				time = rail.getTime() + getTime(railListTmp2, rail.getA(), q);
			}else{
				railListTmp.push(rail);
				continue;
			}
			
			if(min > time){
				min = time;
			}
		}
		return min;
	}
	
	static class Rail {
		int a;
		int b;
		int cost;
		int time;
		
		public Rail(int a, int b, int cost, int time) {
			this.a = a;
			this.b = b;
			this.cost = cost;
			this.time = time;
		}
		
		public int getA() {
			return a;
		}
		public int getB() {
			return b;
		}
		public int getCost() {
			return cost;
		}
		public int getTime() {
			return time;
		}
	}

}