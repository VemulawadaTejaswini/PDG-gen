
import java.util.Scanner;

public class Main {

	void main(){
		try(Scanner sc = new Scanner(System.in)){
			int x = sc.nextInt();
			System.out.printf("%d\n",x*x*x);
		}
	}

	public static void main(String[] args) {
		new Main().main();
	}

}

