import java.util.*;
import java.math.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static final int TOTAL = 1000000;
	static long[][] matrix;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		matrix = new long[n][2];
		for(int i = 0; i < n; i++){
			matrix[i][0] = sc.nextLong();
			matrix[i][1] = sc.nextLong()*sc.nextLong();
		}
		return true;
	}
	
	static void solve(){
		boolean isOver = false;
		for(int i = 0; i < matrix.length; i++){
			long ID = matrix[i][0];
			long value = matrix[i][1];
			for(int j = i+1; j < matrix.length; j++){
				if(ID == matrix[j][0]){
					value += matrix[j][1];
				}
			}
			if(value >= TOTAL){
				System.out.println(ID);
				isOver = true;
			}
		}
		if(!isOver)System.out.println("NA");
	}
}