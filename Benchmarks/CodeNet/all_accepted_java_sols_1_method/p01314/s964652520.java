import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int n = sc.nextInt();
				if(n == 0) break;
				
				int count = 0;
				for(int i=1; i<n; i++) {
					int k = i;
					for(int j=i+1; j<n; j++) {
						if(k + j == n) {
							count++;
							break;
						}
						if(k + j < n) {
							k += j;
							continue;
						}
						else break;
					}
				}
				System.out.println(count);
			}
		}
	}
}
