import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n == 0 || r == 0){
                break;
            }

            int x[] = new int[n];

            int i;
            for(i=0; i<n; i++){
                x[i] = n - i;
            }

            int j;
            for(j=0; j<r; j++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                IntStream stream1 = Arrays.stream(Arrays.copyOfRange(x, p-1, p+c-1));
                IntStream stream2 = Arrays.stream(Arrays.copyOfRange(x, 0, p-1));
                IntStream stream3 = Arrays.stream(Arrays.copyOfRange(x, p+c-1, n));
                IntStream s = IntStream.concat(IntStream.concat(stream1, stream2),stream3);
                x = s.toArray();
            }

            System.out.println(x[0]);
        }

        sc.close();

    }
}
