import java.util.*;

public class Main {

	@SuppressWarnings("resource")
	void run() {

		//
		// 画面入力
		//
		Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k = sc.nextInt();

    	int digit = 1;
    	for(int i = 1; n - Math.pow(k, i) >= 0; i++){
    		digit = i + 1;
    	}
    	System.out.println(digit);

	}
	
    public static void main(String[] args) {
        new Main().run();
    }
}