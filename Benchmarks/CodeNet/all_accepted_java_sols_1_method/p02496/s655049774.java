import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final String TYPE[] = {"S","H","C","D"};
		int cards[][] = new int[4][13];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			String M = sc.next();
			int R = sc.nextInt();
			for(int j = 0;j < 4; j++){
				if(M.equals(TYPE[j])){
					cards[j][R - 1] = 1;
					break;
				}
			}
		}
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++){
				if(cards[i][j] == 0) System.out.println(String.format("%s %d", TYPE[i],j + 1));
			}
		}
		
	}
}