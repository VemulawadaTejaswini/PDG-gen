import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int count=0;
		
		for(int a = 0;a<=A;a++) {
			if(500 * a>X) {
				break;
			}
			for(int b = 0;b<=B;b++) {
				if((500 * a)+(100 * b) > X) {
					break;
				}
				for(int c = 0;c<=C;c++) {
					if((500 * a)+(100 * b)+(50 * c)>X) {
						break;
					}
					int sum =(500 * a)+(100 * b)+(50 * c);
					if(sum==X) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
		
	}
}