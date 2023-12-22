import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(), x = scanner.nextInt();
		int count = 0;
		for(int i=0;i<=c;i++){
			for(int j=0;j<=b;j++){
				for(int k=0;k<=a;k++){
					int sum = (k * 500) + (j * 100) + (i * 50);
					if(sum > x){
						break;
					}
					if(sum == x){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
