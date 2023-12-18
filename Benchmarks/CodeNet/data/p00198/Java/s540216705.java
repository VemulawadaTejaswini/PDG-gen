import java.util.*;

public class Main{
	String name = "CYRMGB";
	
	//サイコロ	//dice is, 2 = south, 3 = east, 1 = top, 6 = bottom, 4 = west, 5 = north;
	class Dice{
		int [] dice;
		public Dice(int[] dice) {
			this.dice = dice;
		}
		private void slide() {
			swap(2,4,5,3);
		}
		private void turn(char c) {
			switch(c){
			case 'n': swap(1,5,6,2); break;
			case 's': swap(1,2,6,5); break;
			case 'w': swap(1,4,6,3); break;
			case 'e': swap(1,3,6,4); break;
			}
		}
		private void swap(int i, int j, int k, int l) {
			int temp = dice[l];
			dice[l] = dice[k];
			dice[k] = dice[j];
			dice[j] = dice[i];
			dice[i] = temp;
		}
		@Override
		public String toString() {
			return "Dice [dice=" + Arrays.toString(dice) + "]";
		}
		
	}
	
	//サイコロが同じかどうか判定する
	private boolean isSame(Dice aa, Dice bb) {
		String [] order = {"", "n", "s", "w", "e", "nn"};
		String [] revorder = {"", "s", "n", "e", "w", "nn"};
		Dice a = new Dice(aa.dice);
		Dice b = new Dice(bb.dice);
		for(int i = 0; i < order.length ; i++){
			for(int j = 0; j < order[i].length(); j++){
				char c = order[i].charAt(j);
				b.turn(c);
			}
			for(int j = 0; j < 4; j++){
				b.slide();
				if(a.toString().equals(b.toString())){
					return true;
				}
			}
			for(int j = 0; j < revorder[i].length(); j++){
				char c = revorder[i].charAt(j);
				b.turn(c);
			}
		}
		return false;
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			Dice [] d = new Dice[n];
			for(int i = 0; i < n; i++){
				int [] tempdice = new int[7];
				for(int j = 1; j <= 6; j++){
					String s = sc.next().charAt(0) + "";
					tempdice[j] = name.indexOf(s);
				}
				d[i] = new Dice(tempdice);
			}
			
			int count = 0;
			for(int i = 0; i < n; i++){
				for(int j = i + 1; j < n; j++){
					if(isSame(d[i], d[j])){
						count++;
						break;
					}
				}
			}
			System.out.println(count);
		}
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}