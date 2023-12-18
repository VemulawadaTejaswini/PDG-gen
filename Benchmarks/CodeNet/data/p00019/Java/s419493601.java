import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(fact(scanner.nextInt()));
	}
	public static int fact(int a){
		if(a == 1){
			return 1;
		}else{
			return (a * fact(a-1));
		}
	}
}