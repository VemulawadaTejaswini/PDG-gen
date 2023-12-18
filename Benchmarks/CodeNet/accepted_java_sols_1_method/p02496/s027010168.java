import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] card = new int [4][14];
		int n = sc.nextInt();
		String[] shcd = {"S", "H", "C", "D"};
		
		for(int i = 0; i < n;i++){
			String a = sc.next();
			int b = sc.nextInt();
			if(a.equals("S")){
				card[0][b] = 1;
			}else if(a.equals("H")){
				card[1][b] = 1;
			}else if(a.equals("C")){
				card[2][b] = 1;
			}else if(a.equals("D")){
				card[3][b] = 1;
			}
		}
		
		for(int i = 0; i < 4;i++){
			for(int k = 1;k < 14;k++){
				if(card[i][k] == 0 ){
					System.out.println(shcd[i]+" "+k);
				}
			}
		}
	}

}