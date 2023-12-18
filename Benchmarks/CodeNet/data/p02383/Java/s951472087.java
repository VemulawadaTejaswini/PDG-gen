import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ravel[] = new int[6];
		for(int i = 0; i < 6; i++){
			ravel[i] = scan.nextInt();
		}
		scan.nextLine();
		String order = scan.nextLine();
		scan.close();
		Dice dice = new Dice(ravel);
		dice.Move(order);
		System.out.println(dice.ravel[0]);
	}

	static class Dice{
		public int ravel[] = new int[6];

		public Dice(int[] _ravel) {
			ravel = _ravel;
		}

		public void Move(String order){
			char ch[] = order.toCharArray();
			for(int i = 0; i < ch.length; i++){
				MoveExec(ch[i]);
			}
		}

		private void MoveExec(char chOrder){
			int[] oldRavel = ravel.clone();
			switch(chOrder){
			case 'E':
				ravel[0] = oldRavel[3];
				ravel[3] = oldRavel[5];
				ravel[5] = oldRavel[2];
				ravel[2] = oldRavel[0];
				break;
			case 'N':
				ravel[0] = oldRavel[1];
				ravel[1] = oldRavel[5];
				ravel[5] = oldRavel[4];
				ravel[4] = oldRavel[0];
				break;
			case 'S':
				ravel[0] = oldRavel[4];
				ravel[4] = oldRavel[5];
				ravel[5] = oldRavel[1];
				ravel[1] = oldRavel[0];
				break;
			case 'W':
				ravel[0] = oldRavel[2];
				ravel[2] = oldRavel[5];
				ravel[5] = oldRavel[3];
				ravel[3] = oldRavel[0];
				break;
			}
		}
	}
}