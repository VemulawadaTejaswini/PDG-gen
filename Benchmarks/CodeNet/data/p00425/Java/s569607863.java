import java.util.*;
import java.awt.geom.*;

public class Main{

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int sum = 1;
			Dice d = new Dice(new int[]{0,1,2,3,4,5,6});
			while(n-- > 0){
				String s = sc.next();
				char c = s.charAt(0);
				if(c == 'N'){
					d.turn('n');
				}
				else if(c == 'E'){
					d.turn('e');
				}
				else if(c == 'W'){
					d.turn('w');
				}
				else if(c == 'S'){
					d.turn('s');
				}
				else if(c == 'L'){
					d.slide();
					d.slide();
					d.slide();
				}
				else if(c == 'R'){
					d.slide();
				}
				sum += d.dice[1];
			}
			System.out.println(sum);
		}
	}

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
	}
	
	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}