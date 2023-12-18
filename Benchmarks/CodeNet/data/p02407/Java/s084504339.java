import java.util.Scanner;

class Main {
	int[] k = new int[101];
	public void kami() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n <= 100){
			for(int x = 1; x <= n; x++){
				 k[x] = sc.nextInt();
			}

			for(int i = n; i >= 2; i--){
				System.out.print(k[i] + " ");
			}
			System.out.print(k[1]);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		new Main().kami();
	}

}