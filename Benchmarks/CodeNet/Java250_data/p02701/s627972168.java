import java.util.HashMap;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();

                HashMap<String, Integer> Shash = new HashMap<String, Integer>();

                for (int i = 0; i < N; i++) {
                	String s = scan.next();
                	if (!Shash.containsKey(s)) {
                		Shash.put(s, 1);
                	}
                }

                System.out.println(Shash.size());

        }

}