import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line[] = br.readLine().split(" ");
        int intArray[] = new int[n];
		long longArray[] = new long[n];
        for (int i=0; i<n; i++){
            intArray[i] = Integer.parseInt(line[i]);
			longArray[i] = Long.parseLong(line[i]);
        }

        int mi = Integer.MAX_VALUE;
        for (int i=0; i<n; i++){
            mi = Math.min(mi,intArray[i]);
        }
        
        int ma = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            ma = Math.max(ma,intArray[i]);
        }
        
        long sum = 0;
        for (int i=0; i<n; i++){
            sum += longArray[i];
        }
        System.out.printf("%s %s %s\n", mi , ma, sum);
    }
}