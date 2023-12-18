import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] namber = new int[200];
		int [][] array = new int [n+1][4];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= 3; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		for(int j = 1; j <= 3; j++){
			int count = 1;
			for(int k = 1; k < n; k++) {
				for(int i = k + 1; i <= n; i++) {
					if(array[k][j] == array[i][j]) {
						namber[count] = array[k][j];
						count++;
					}
				}
			}
			for(int k = 1; k < namber.length;k++){
				for(int i = 1; i <= n; i++) {
					if(namber[k] == array[i][j]){
						array[i][j] = 0;
					}
				}
			}
		}
		for(int i = 1; i <= n; i++) {
			int answer = 0;
			for(int j = 1; j <= 3; j++) {
				answer += array[i][j];
			}
			System.out.println(answer);
		}
	}
}