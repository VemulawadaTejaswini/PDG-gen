import java.util.Scanner;
class Main {
	public void kami() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(3 <= n && n <= 10000){
			for(int i = 3; i <= n; i++){
				int x = i % 3;
				int y = i % 10;
				int anko = i / 10;
				int inko = i / 10 % 10;
				int unko = i / 100;
				int enko = i / 100 % 10;
				int onko = i / 1000;
				
				if(x == 0){
					System.out.print(" " + i);
				}else if(y == 3 || anko == 3 || inko == 3 || unko == 3 || enko == 3 || onko == 3){
					System.out.print(" " + i);
				}
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {

		new Main().kami();
	}

}