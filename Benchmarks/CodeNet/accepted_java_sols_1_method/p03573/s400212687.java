import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(),b = scanner.nextInt(),c = scanner.nextInt();
		if(a == b){
			System.out.println(c);
		}else if(a == c){
			System.out.println(b);
		}else{
			System.out.println(a);
		}
	}

}
