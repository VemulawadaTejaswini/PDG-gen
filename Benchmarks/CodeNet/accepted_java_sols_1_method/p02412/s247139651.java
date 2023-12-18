import java.util.Scanner;

//20180509
//04

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			int n = scanner.nextInt();
			int x = scanner.nextInt();
			int count = 0;

			if(n + x == 0) {
				break;
			}

			for(int i = 1;i <= n;i++) {
				for(int j = i + 1;j <= n;j++) {
					for(int k = j + 1;k <= n;k++) {
						if(i + j + k == x) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
		scanner.close();
    }
}
