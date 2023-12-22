import java.util.Scanner;
class Main {
	private static int[] k = new int[101];
	public void kami() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n <= 100){
			for(int x = 1; x <= n; x++){
				 k[x] = sc.nextInt();
			}
			for(int i = n; i >= 2; i--){
				for(int j = n - 1; j >= 1; j--){
					if(j < i){
						int work = k[j];
						k[j] = k[i];
						k[i] = work;
					}
				}
			}
			for(int i = 1; i <= n - 1; i++){
				System.out.print(k[i] + " ");
			}
			System.out.println(k[n]);
		}
	}

	public static void main(String[] args) {

		new Main().kami();
	}

}