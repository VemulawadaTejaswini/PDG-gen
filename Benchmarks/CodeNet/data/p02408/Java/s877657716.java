import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	public static final int
		S = 0, H = 1, C = 2, D = 3;

	public static void main(String[] args){
		boolean[][] trump = new boolean[4][13];
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			String m = scan.next();
			int num = scan.nextInt();
			char c = m.charAt(0);
			int a = 0;
			switch(c){
				case 'S' :
					a = S;
					break;
				case 'H' :
					a = H;
					break;
				case 'C' :
					a = C;
					break;
				case 'D' :
					a = D;
					break;
				default :
					break;
			}
			trump[a][num - 1] = true;
		}

		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++){
				if(trump[i][j] == false){
					char c = null;
					switch(i){
						case 0 :
							c = 'S';
							break;
						case 1 :
							c = 'H';
							break;
						case 2 :
							c = 'C';
							break;
						case 3 :
							c = 'D';
							break;
						default :
							break;
					}
					System.out.printf("%c %d\n", c, i + 1);
				}
			}
		}
	}
}