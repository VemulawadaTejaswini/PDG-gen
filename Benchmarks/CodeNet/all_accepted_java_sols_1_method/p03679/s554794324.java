import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt(),a = scanner.nextInt(),b = scanner.nextInt();
		if(b <= a){
			System.out.println("delicious");
		}else if(b > a && b-x <= a){
			System.out.println("safe");
		}else{
			System.out.println("dangerous");
		}
	}

}
