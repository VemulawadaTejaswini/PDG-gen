	import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(),n = 0;
		for (int d = a;d <= b;d++){
			if(c%d == 0){n++;}
		}
		System.out.println(n);}
}