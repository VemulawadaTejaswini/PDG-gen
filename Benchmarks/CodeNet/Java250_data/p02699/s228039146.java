
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int w = sc.nextInt();
		if(s<=w) {
			System.out.println("unsafe");
		}else {
			System.out.println("safe");
		}
		sc.close();
	}


}