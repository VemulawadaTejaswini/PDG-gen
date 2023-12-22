import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), y = scanner.nextInt();
		for(int i=0;i<=n;i++){
			for(int j=n-i;j>=0;j--){
				int sum = i * 10000;
				sum += j * 5000;
				sum += (n - (i + j)) * 1000;
				if(sum == y){
					System.out.println(i + " " + j + " " + (n-(i+j)));
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}

}
