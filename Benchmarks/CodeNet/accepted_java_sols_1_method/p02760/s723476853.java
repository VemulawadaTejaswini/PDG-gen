import java.util.ArrayList;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] A = new int [3][3];

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		int N = sc.nextInt();
		ArrayList<Integer> nums = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			nums.add(sc.nextInt());
		}

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(nums.contains((A[i][j]))){
					A[i][j] = -1;
				}
			}
		}

		boolean ans = false;
		
		// horizontal
		for(int i = 0; i < 3; i++) {
			if(A[i][0]==-1 && A[i][1]==-1 && A[i][2]==-1) {
				ans = true;
			}
		}

		// vertical
		for(int j = 0; j < 3; j++) {
			if(A[0][j]==-1 && A[1][j]==-1 && A[2][j]==-1) {
				ans = true;
			}
		}
		
		// diagonal
		if(A[0][0]==-1 && A[1][1]==-1 && A[2][2]==-1) {
			ans = true;
		}
		if(A[0][2]==-1 && A[1][1]==-1 && A[2][0]==-1) {
			ans = true;
		}
		
		if(ans) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		sc.close();
	}
	
}