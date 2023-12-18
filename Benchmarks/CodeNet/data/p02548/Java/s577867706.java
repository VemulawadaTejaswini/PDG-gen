import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int count = 0;
			for(int i = 1;i < n;i++) {
				for(int j = 1;j < n;j++) {
					for(int x = 1;x < n;x++) {
						if(i * j + x == n) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
