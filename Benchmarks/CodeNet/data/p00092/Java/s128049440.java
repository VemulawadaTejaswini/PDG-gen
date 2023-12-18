import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[][] source;
	static int[][] field; 
	static int n;

	public static void main(String[] args) {
		while(read()){
			slove();
		}

	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)
			return false;
		source = new char[n][n];
		field = new int[n][n];
		String line;
		for(int i = 0; i < n; i++){
			line = sc.next();
			for(int j = 0; j < n; j++){
				source[i][j] = line.charAt(j);
				field[i][j] = 0;
			}
		}
		
		return true;
	}
	static int min(int a, int b, int c){
		int temp = Math.min(a, b);
		int min = Math.min(c, temp);
		return min;
	}
	static void slove(){
		int maxWidth = 0;
		for(int i = 1; i < n; i++){
			for(int j = 1; j < n; j++){
				if(source[i][j] == '*'){
					field[i][j] = 0;
				}else{
					field[i][j] = min(field[i-1][j-1], field[i-1][j], field[i][j-1])+1;
					maxWidth = Math.max(maxWidth, field[i][j]);
				}
			}
		}
		System.out.println(maxWidth);
	}

}