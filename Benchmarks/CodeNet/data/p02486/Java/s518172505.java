import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int x = sc.nextInt();
			int count = 0;
			if(n == 0 && x == 0) break;
			if(n < 3||n > 100||x < 3||x > 100) continue;
			for(int i = 0;i < n;i++) {
				for(int j = i+1;j < n;j++) {
					for(int k = j+1;k < n;k++) {
						if(i + j + k == x){
							count++;
							break;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}