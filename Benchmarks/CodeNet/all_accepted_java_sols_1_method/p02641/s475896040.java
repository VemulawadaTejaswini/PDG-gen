import java.util.HashMap;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int X = scan.nextInt();
                int N = scan.nextInt();

                HashMap<Integer, Integer> pHash = new HashMap<Integer, Integer>();

                for (int i = 0; i < N; i++) {
                	pHash.put(scan.nextInt(), 1);
                }

                scan.close();

                int distance = 0;
                int temp = X;
                int output = 0;

                while (true) {

                	temp = X - distance;
                	if (!pHash.containsKey(temp)) {
                		output = temp;
                		break;
                	}

                	temp = X + distance;
                	if (!pHash.containsKey(temp)) {
                		output = temp;
                		break;
                	}

                	distance++;

                }

                System.out.println(output);

        }

}