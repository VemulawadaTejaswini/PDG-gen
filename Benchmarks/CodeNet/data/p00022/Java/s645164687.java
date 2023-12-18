import java.util.Scanner;
public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int a;
		while ((a = sc.nextInt())>0){
			int max = 0;
			int value = 0;
			for (int i=0; i<a; i++){
				int b =sc.nextInt();
				if (b>0) {max += b;}
				else {
					value = Math.max(value, max);
					max = 0;
				}
			}
			System.out.println(value);
			value = 0;
		}
	}
}