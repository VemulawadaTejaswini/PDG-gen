import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt(),s = scanner.nextInt();
		int count = 0;
		for(int i=0;i<=k;i++){
			int sum = 0;
			for(int j=0;j<=k;j++){
				sum = i + j;
				if((s-sum) >= 0 && (s-sum) <= k){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
