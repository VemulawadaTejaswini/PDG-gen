import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int[] fuda = new int[n];
			for(int i = 0; i < n; i++){
				fuda[i] = n - i;
			}
			int r = sc.nextInt();

			if (n == 0 && r == 0) break;

			for(int i = 0; i < r; i++){
				int p = sc.nextInt();
				int c = sc.nextInt();
				int[] temp = new int[p-1];
				for(int j = 0; j < p-1; j++){
					temp[j] = fuda[j];
				}
				for(int j = 0; j < c; j++){
					fuda[j] = fuda[p+j-1];
				}
				for(int j = 0; j < p-1; j++){
					fuda[c+j] = temp[j];
				}				
			}
			System.out.println(fuda[0]);
		}
	}
}