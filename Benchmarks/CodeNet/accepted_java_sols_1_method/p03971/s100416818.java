import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int N = scanner.nextInt();
		final int A = scanner.nextInt();
		final int B = scanner.nextInt();
		String s = scanner.next();
		int a = 0, b = 0;
		for(int i = 0; i < N; i++){
			switch(s.charAt(i)){
				case 'a':
					if(a+b < A+B){
						a++;
						System.out.println("Yes");
						continue;
					}
					break;
				case 'b':
					if(a+b < A+B && (b<B || b == 0)){
						b++;
						System.out.println("Yes");
						continue;
					}
					break;
			}
			System.out.println("No");
		}
		scanner.close();
	}

}
