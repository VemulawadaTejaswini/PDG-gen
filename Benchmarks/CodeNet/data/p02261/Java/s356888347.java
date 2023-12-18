import java.util.Scanner;

public class alds12c {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		String s;
		char[] ch;
		
		char[][] C = new char[2][n];
		char[][] C2 = new char[2][n];
		
		for(int i = 0; i < n; i++){
			s = scan.next();
			ch = s.toCharArray();
			C[0][i] = ch[0];
			C[1][i] = ch[1];
			C2[0][i] = C[0][i];
			C2[1][i] = C[1][i];
		}
		
		//??????????????????
		char swap;
		for(int i = 0; i <= n - 1; i++){
			for(int j = n-1; j >= i + 1; j--){
				if(C[1][j] < C[1][j-1]){
					swap = C[1][j];
					C[1][j] = C[1][j-1];
					C[1][j-1] = swap;
					swap = C[0][j];
					C[0][j] = C[0][j-1];
					C[0][j-1] = swap;
				}
			}
		}
		
		//???????????????
		int minj;
		for(int i = 0; i <= n - 1; i++){
			minj = i;
			for(int j = i; j <= n - 1; j++){
				if(C2[1][j] < C2[1][minj]){
					minj = j;
				}
			}
			swap = C2[1][i];
			C2[1][i] = C2[1][minj];
			C2[1][minj] = swap;
			swap = C2[0][i];
			C2[0][i] = C2[0][minj];
			C2[0][minj] = swap;
		}
		
		for(int i = 0; i < n; i++){
			System.out.print(C[0][i]);
			System.out.print(C[1][i]);
			if(i < n - 1)System.out.print(" ");
			else System.out.println();
		}
		System.out.println("Stable");
		
		boolean flag = true;
		
		for(int i = 0; i < n; i++){
			System.out.print(C2[0][i]);
			System.out.print(C2[1][i]);
			if(C[0][i] != C2[0][i] || C[1][i] != C2[1][i])flag = false;
			if(i < n - 1)System.out.print(" ");
			else System.out.println();
		}
		if(flag == true) System.out.println("Stable");
		else System.out.println("Not Stable");
	}
}