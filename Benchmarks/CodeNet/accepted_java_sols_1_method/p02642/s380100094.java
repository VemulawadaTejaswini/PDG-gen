import java.util.HashMap;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();

                int[] A = new int[N];
                HashMap<Integer, Integer> aHash = new HashMap<Integer, Integer>();
                HashMap<Integer, Integer> aKaburiHash = new HashMap<Integer, Integer>();

                for (int i = 0; i < N; i++) {
                	int temp = scan.nextInt();
                	A[i] = temp;

                	if (!aHash.containsKey(temp)) {
                		aHash.put(temp, 1);
                	} else {
                		aKaburiHash.put(temp, 1);
                	}

                }

                scan.close();

                int count = 0;

                aRoop: for (int a = 0; a < N; a++) {
                	
                	int tempA = A[a];

                	if (aKaburiHash.containsKey(tempA)) {
                		continue aRoop;
                	}
                	
                	aHash.remove(tempA);

	                int rootA = (int)Math.sqrt(tempA);

	                for (int i = 1; i <= rootA; i++) {


	                	if (tempA%i == 0) {

	                		if (aHash.containsKey(i)) {
	                			continue aRoop;
	                		}

	                		if (i != tempA/i && aHash.containsKey(tempA/i)) {
	                			continue aRoop;
	                		}
	                		
	                	}

	                }
	                
	                count++;
	                
	                aHash.put(tempA, 1);

                }

                System.out.println(count);

        }
}