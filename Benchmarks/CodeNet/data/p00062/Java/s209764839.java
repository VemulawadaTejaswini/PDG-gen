import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[][] array = new int[11][11];
	
	public static void main(String[] args) {
		for(int i = 0; i < 11; i++){
			for(int j = 0; j < 11; j++){
				array[i][j] = 0;
			}
		}
		for(int k = 0; k < 11; k++){
			array[0][k] = -1;
			array[k][0] = -1;
		}
		while(read()){
			slove();
		}

	}
	static boolean read(){
		String line;
		line = sc.next();
		char c;
		
		for(int i = 1; i < 11; i++){
			c = line.charAt(i-1);
			array[1][i] = Integer.parseInt(String.valueOf(c));
			//System.out.println(array[1][i]);
		}
		return true;
	}
	static void slove(){
		for(int i = 2; i<=10; i++){
			for(int j = 2; j<=10; j++){
				array[i][j] = (array[i-1][j-1] + array[i-1][j])%10;
			}
		}
		
		
		System.out.println(array[10][10]);
		/*for(int i = 1; i < 11; i++){
			for(int j = 1; j < 11; j++){
				System.out.print(array[i][j]);
			}
			System.out.println();
		}*/
	}

}