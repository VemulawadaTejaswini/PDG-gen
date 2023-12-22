import java.util.Scanner;

class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		for(;;){
			int n = scan.nextInt();
			int x = scan.nextInt();
			int tmp = 0;

			if(n == 0 && x == 0)
				break;

			for(int i=1; i<n; i++){
				for(int s=i+1; s<n; s++){
					for(int t=s+1; t<=n; t++){
						if(i + s + t == x)
							tmp++;
					}
				}
			}
			System.out.println(tmp);

		}

	}

}