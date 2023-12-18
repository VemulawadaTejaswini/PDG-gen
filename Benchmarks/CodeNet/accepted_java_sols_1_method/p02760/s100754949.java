import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] A = new int[3][3];
		for(int i =0; i<3 ; i ++) {
			for(int j =0; j<3 ; j ++) {
				A[i][j] = sc.nextInt();
			}
		}
		int N = sc.nextInt();
		int[] b = new int[N];
		int[][] checkA = new int[3][3];
		for(int k=0; k < N; k++) {
			b[k] = sc.nextInt();
			for(int i =0; i<3 ; i ++) {
				for(int j =0; j<3 ; j ++) {
					if(A[i][j] == b[k]) checkA[i][j] = 1;
				}
			}
		}

		boolean ans = false;
		for(int i =0; i<3 ; i ++) {
			int checkSum = 0;
			for(int j =0; j<3 ; j ++) {
				checkSum += checkA[i][j];
			}
			if(checkSum == 3)  ans = true;
		}

		for(int i =0; i<3 ; i ++) {
			int checkSum = 0;
			for(int j =0; j<3 ; j ++) {
				checkSum += checkA[j][i];
			}
			if(checkSum == 3)  ans = true;
		}

		int checkSum = 0;
		for(int j =0; j<3 ; j ++) {
			checkSum += checkA[j][j];
		}
		if(checkSum == 3)  ans = true;
		
		checkSum = 0;
		for(int j =0; j<3 ; j ++) {
			checkSum += checkA[j][2-j];
		}
		if(checkSum == 3)  ans = true;
		
		if(ans) System.out.println("Yes");
		else System.out.println("No");




	}
}
