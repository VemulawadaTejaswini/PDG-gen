import java.util.Scanner;
class Main {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n;
		int[] a = new int [200];
		int i;
		
		n = scn.nextInt();
		
		for (i = 0; i < n; i++){
			a[i] = scn.nextInt();
		}
		
		for (int j = i - 1; j >= 0; j--){
			System.out.print(a[j]);
			if (j > 0){
				System.out.print(" ");
			} else {
				System.out.print("\n");
			}
		}
		
		scn.close();
	}
}