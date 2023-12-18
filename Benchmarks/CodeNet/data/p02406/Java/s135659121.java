import java.util.Scanner;
class Main {
	public void kami() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int unko = n / 10;
		
		for(int i = unko; i <= n; i++){
			int x = i % 3;
			int y = i % 10;
			
			if(x == 0){
				System.out.print(i + " ");
			}else if(y == unko){
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {

		new Main().kami();
	}

}