import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	public static final int
		Sp = 0, Ha = 1, Cu = 2, Di = 3;

	public static void main(String[] args){
		boolean[][] trump = new boolean[4][13];
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++){
				trump[i][j] = false;
			}
		}
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			String m = scan.next();
			int num = scan.nextInt();
			char mc = m.charAt(0);
			int a = 0;
			switch(mc){
				case 'S' :
					a = Sp;
					break;
				case 'H' :
					a = Ha;
					break;
				case 'C' :
					a = Cu;
					break;
				case 'D' :
					a = Di;
					break;
			}
			trump[a][num - 1] = true;
		}

		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++){
				if(trump[i][j] == false){
					char mc = 0;
					switch(i){
						case 0 :
							mc = 'S';
							break;
						case 1 :
							mc = 'H';
							break;
						case 2 :
							mc = 'C';
							break;
						case 3 :
							mc = 'D';
							break;
					}
					System.out.printf("%c %d\n", mc, j + 1);
				}
			}
		}
	}
}