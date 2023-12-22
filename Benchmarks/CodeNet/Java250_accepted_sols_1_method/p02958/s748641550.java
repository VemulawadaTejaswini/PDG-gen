import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int N = sc.nextInt();
		int Count = 0;
		for(int i = 1; i <= N; i++) {
			if(i != sc.nextInt()) {
				Count++;
				if(Count > 2) {
					break;
				}
			}
		}
		if(Count == 0 || Count == 2) System.out.println("YES");
		else System.out.println("NO");
	}
}