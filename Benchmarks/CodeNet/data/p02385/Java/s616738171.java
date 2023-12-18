import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			Dice dice1 = new Dice(sc.nextLine().split(" "));
			Dice dice2 = new Dice(sc.nextLine().split(" "));

			System.out.println(dice1.equals(dice2)?"Yes":"No");
		}
	}
	static class Dice{

		private int[] face;
		
		public Dice(String[] face) {
			this.face = new int[6];
			for(int i=0;i<this.face.length;i++) {
				this.face[i] = Integer.parseInt(face[i]);
			}
		}

		/**
		 * 東西南北EWSN+右左RLでさいころを回転させます
		 * @param to 回転向き?
		 */
		public void rotate(char to){
			int buf;
			switch(to) {
			case 'E':
				buf = this.face[0];
				this.face[0] = this.face[3];
				this.face[3] = this.face[5];
				this.face[5] = this.face[2];
				this.face[2] = buf;
				break;
			case 'W':
				buf = this.face[0];
				this.face[0] = this.face[2];
				this.face[2] = this.face[5];
				this.face[5] = this.face[3];
				this.face[3] = buf;
				break;
			case 'S':
				buf = this.face[0];
				this.face[0] = this.face[4];
				this.face[4] = this.face[5];
				this.face[5] = this.face[1];
				this.face[1] = buf;
				break;
			case 'N':
				buf = this.face[0];
				this.face[0] = this.face[1];
				this.face[1] = this.face[5];
				this.face[5] = this.face[4];
				this.face[4] = buf;
				break;
			case 'R':
				buf = this.face[1];
				this.face[1] = this.face[2];
				this.face[2] = this.face[4];
				this.face[4] = this.face[3];
				this.face[3] = buf;
				break;
			case 'L':
				buf = this.face[1];
				this.face[1] = this.face[3];
				this.face[3] = this.face[5];
				this.face[5] = this.face[2];
				this.face[2] = buf;
				break;
			}
		}
		
		/**
		 * 2つのさいころが同じ物か判定します
		 * 比較する側は回されます。
		 * @param dice
		 * @return 同じか否か
		 */
		public boolean equals(Dice dice) {
			for(int i=0;i<4;i++) {
				dice.rotate('N');
				for(int j=0;j<4;j++) {
					dice.rotate('R');
					int k;
					for(k=0;k<6;k++) {
						if(this.showN(k) != dice.showN(k)) break;
					}
					if(k==6) return true;
				}
			}
			for(int i=0;i<2;i++) {
				dice.rotate('E');
				for(int j=0;j<4;j++) {
					dice.rotate('R');
					int k;
					for(k=0;k<6;k++) {
						if(this.showN(k) != dice.showN(k)) break;
					}
					if(k==6) return true;
				}
				dice.rotate('E');
			}
			return false;
		}
		public int showN(int n) {
			return this.face[n];
		}
	}
}
