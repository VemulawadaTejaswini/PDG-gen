import java.util.*;
public class Main {
	String [] order = {"","n","s", "e", "w", "nn"};
	
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
			int n = sc.nextInt();
			if(n == 0) break;
			HashMap<String, Integer> tonum = new HashMap<String, Integer>();
			Dice [] d = new Dice[n];
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
			
			if(n == 1){
				System.out.println(0);
			}
			else if(n == 2){
				System.out.println(solve(d));
			}
			else if(n == 3){
				int res = solve3(d);
				System.out.println(res);
			}
			else{
				int res = solve4(d);
				System.out.println(res);
			}
		}
	}

	private int solve4(Dice [] d) {
		int res = 1 << 24;
		for(int j1 = 0; j1 < order.length; j1++){
			for(int i1 = 0; i1 < order[j1].length(); i1++){
				d[1].turn(order[j1].charAt(i1));
			}
			
			for(int i1 = 0; i1 < 4; i1++){
				d[1].slide();
				
				//2個目
				for(int j2 = 0; j2 < order.length; j2++){
					for(int i2 = 0; i2 < order[j2].length(); i2++){
						d[2].turn(order[j2].charAt(i2));
					}
					for(int i2 = 0; i2 < 4; i2++){
						d[2].slide();
						
						for(int j3 = 0; j3 < order.length; j3++){
							for(int i3 = 0; i3 < order[j3].length(); i3++){
								d[3].turn(order[j3].charAt(i3));
							}
							
							for(int i3 = 0; i3 < 4; i3++){
								d[3].slide();
								int sum = 0;
								for(int i = 0; i < 6;i++){
									HashMap<Integer,Integer> s = new HashMap<Integer, Integer>();
									for(int j = 0; j < d.length; j++){
										if(s.containsKey(d[j].dice[i])){
											s.put(d[j].dice[i], s.get(d[j].dice[i] + 1));
										}
										else{
											s.put(d[j].dice[i], 1);
										}
										
									}
									
									if(s.size() == 2){
										for(int key: s.keySet()){
											if(s.get(key) == 2){
												sum += 2;
												break;
											}
											else{
												sum += 1;
												break;
											}
										}
									}
									else{
										sum += s.size() - 1;
									}
								}
								res = Math.min(sum, res);
							}
						}
					}
				}
				
			}
		}
		return res;
	}

	private int solve3(Dice [] d) {
		int res = 1 << 24;
		for(int j1 = 0; j1 < order.length; j1++){
			for(int i1 = 0; i1 < order[j1].length(); i1++){
				d[1].turn(order[j1].charAt(i1));
			}
			
			for(int i1 = 0; i1 < 4; i1++){
				d[1].slide();
				
				//2個目
				for(int j2 = 0; j2 < order.length; j2++){
					for(int i2 = 0; i2 < order[j2].length(); i2++){
						d[2].turn(order[j2].charAt(i2));
					}
					for(int i2 = 0; i2 < 4; i2++){
						d[2].slide();

						int sum = 0;
						for(int i = 0; i < 6;i++){
							HashSet<Integer> s = new HashSet<Integer>();
							for(int j = 0; j <  d.length; j++){
								s.add(d[j].dice[i]);
							}
							sum += s.size() - 1;
						}
						res = Math.min(sum, res);
					}
				}
				
			}
		}
		return res;
	}

	private int solve(Dice [] d) {
		int res = 1 << 24;
		for(int j1 = 0; j1 < order.length; j1++){
			for(int i1 = 0; i1 < order[j1].length(); i1++){
				d[1].turn(order[j1].charAt(i1));
			}
			
			for(int i1 = 0; i1 < 4; i1++){
				d[1].slide();
				
				int sum = 0;
				for(int i = 0; i < 6;i++){
					HashSet<Integer> s = new HashSet<Integer>();
					for(int j = 0; j <  d.length; j++){
						s.add(d[j].dice[i]);
					}
					sum += s.size() - 1;
				}
				res = Math.min(sum, res);
				
			}
		}
		return res;
	}
	

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}