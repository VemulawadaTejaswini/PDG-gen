import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			int n = scan.nextInt();
			int x = scan.nextInt();
			if(n == 0 && x == 0){
				scan.close();
				break;
			}
			int cnt = 0;
			for(int i = n; i >= 3; i--){
				for(int j = i - 1; j >= 2; j--){
					for(int k = j - 1; k >= 1; k--){
						if(i + j + k == x){
							//System.out.println(i + " + " + j + " + " + k + " = " + x);
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}
}