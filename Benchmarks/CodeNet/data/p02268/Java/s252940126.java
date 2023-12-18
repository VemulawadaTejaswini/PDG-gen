import java.util.HashMap;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		HashMap<Integer, String> a = new HashMap<Integer, String>();

        for(int i = 0; i < n; i++){
        	a.put(scanner.nextInt(),null);
        }
		int o = scanner.nextInt();
		int count =0;
        for(int i = 0; i < o; i++){
        	if(a.containsKey(scanner.nextInt())) {
        		count++;
        	}
        }
		scanner.close();
        System.out.println(count);
	}
}

