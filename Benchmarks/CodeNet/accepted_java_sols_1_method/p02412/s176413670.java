import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		while(n != 0 || x != 0) {
			int count = 0;
			for(int i=1; i<=n; i++){
				for(int j=i+1; j<=n; j++){
					for(int k=j+1; k<=n; k++){
						if(i + j + k == x) {count = count + 1;}
					}
				}
			}
			System.out.println(count);
			n = scan.nextInt();
			x = scan.nextInt();
		}
	}
}