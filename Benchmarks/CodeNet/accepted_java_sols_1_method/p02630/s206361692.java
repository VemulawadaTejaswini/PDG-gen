import java.util.HashMap;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();

                HashMap<Integer, Integer> AHash = new HashMap<Integer, Integer>();
                long Asum = 0;

                for (int n = 0; n < N; n++) {
                	int temp = scan.nextInt();
                	if (AHash.containsKey(temp)) {
                		AHash.put(temp, AHash.get(temp) + 1);
                	} else {
                		AHash.put(temp, 1);
                	}
                	Asum += temp;
                }

                int Q = scan.nextInt();

                long[] output = new long[Q];

                for (int q = 0; q < Q; q++) {

                	int B = scan.nextInt();
                	int C = scan.nextInt();

                	if (AHash.containsKey(B)) {
                		Asum += (long)(C - B) * AHash.get(B);
                		if (AHash.containsKey(C)) {
                			AHash.put(C, AHash.get(C) + AHash.get(B));
                		} else {
                			AHash.put(C, AHash.get(B));
                		}
                		AHash.remove(B);
                	}

                	output[q] = Asum;

                }

                for (long asum: output) {
                	System.out.println(asum);
                }

                scan.close();

        }
}