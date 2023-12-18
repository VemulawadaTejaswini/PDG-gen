import java.util.*;
public class Main {
	String [] order = {"","n","s", "e", "w", "nn"};
	String [] orderrev = {"","s","n", "w", "e", "nn"};
	int n, ans;
	Dice [] d;
	
	class Dice{
		//dice is, 0 = south, 1 = east, 2 = top, 3 = bottom, 4 = west, 5 = north;
		int [] dice;

		public Dice(int[] dice) {
			this.dice = dice;
		}
		
		private void slide() {
			swap(0,4,5,1);
		}
		
		private void turn(char c) {
			switch(c){
			case 'n':
				swap(2,5,3,0); break;
			case 's':
				swap(2,0,3,5); break;
			case 'w':
				swap(2,4,3,1); break;
			case 'e':
				swap(2,1,3,4); break;
			}
		}

		private void swap(int i, int j, int k, int l) {
			int temp = dice[l];
			dice[l] = dice[k];
			dice[k] = dice[j];
			dice[j] = dice[i];
			dice[i] = temp;
		}
		
	}
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			if(n == 0) break;
			HashMap<String, Integer> tonum = new HashMap<String, Integer>();
			d = new Dice[n];
			for(int i = 0; i < n; i++){
				int [] input = new int[6];
				for(int j = 0; j < 6; j++){
					String s = sc.next();
					int ind = -1;
					if(tonum.containsKey(s)){
						ind = tonum.get(s);
					}
					else{
						ind = tonum.size() + 1;
						tonum.put(s, ind);
					}
					input[j] = ind;
				}
				d[i] = new Dice(input);
			}
			ans = 1 << 24;
			if(n == 1){
				System.out.println(0);
				continue;
			}
			dfs(0);
			System.out.println(ans);
		}
	}
	
	private void dfs(int deep){
		if(deep == n-1){
			//判定
			int sum = 0;
			for(int i = 0; i < 6;i++){
				HashMap<Integer,Integer> s = new HashMap<Integer, Integer>();
				
				for(int j = 0; j < d.length; j++){
					if(s.containsKey(d[j].dice[i])){
						s.put(d[j].dice[i], s.get(d[j].dice[i]) + 1);
					}
					else{
						s.put(d[j].dice[i] , 1);
					}
				}
				
				if(n == 4 && s.size() == 2){
					for(int key: s.keySet()){
						if(s.get(key) == 2){
							sum += 2;
						}
						else{
							sum += 1;
						}
						break;
					}
				}
				else{
					sum += s.size() - 1;
				}
			}
			ans = Math.min(sum, ans);
			return;
		}
		
		for(int i = 0 ; i < order.length; i++){
			for(int j = 0; j < order[i].length(); j++){
				d[deep + 1].turn(order[i].charAt(j));
			}
			for(int k = 0; k < 4; k++){
				d[deep + 1].slide();
				dfs(deep + 1);
			}
			for(int j = 0; j < orderrev[i].length(); j++){
				d[deep + 1].turn(orderrev[i].charAt(j));
			}
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}