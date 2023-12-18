import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int min = 0;
		int mid = 0;
		int max = 0;
		if(a<b) {
			if(b<c) {
				min = a;
				mid = b;
				max = c;
			}else {
				if(a<c) {
					min = a;
					mid = c;
					max = b;
				}else {
					min = c;
					mid = a;
					max = b;
				}
				
			}
		}else {
			if(a<c) {
				min = b;
				mid = a;
				max = c;
			}else {
				if(b<c) {
					min = b;
					mid = c;
					max = a;
				}else {
					min = c;
					mid = b;
					max = a;
				}
			}
		}
		System.out.println(min + " " + mid + " " + max);
		scanner.close();
	}
}

