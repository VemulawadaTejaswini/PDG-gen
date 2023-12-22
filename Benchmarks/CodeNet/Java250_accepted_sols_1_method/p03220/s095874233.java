import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int A = scanner.nextInt();

        double MAX = Double.MAX_VALUE;

        int idx = -1;

        for(int i=0; i<N; i++){
            int tmp = scanner.nextInt();

            double temperature = (double) T - tmp * 0.006;
            double diff = Math.abs(temperature - A);

            if(diff < MAX){
                idx = i + 1;
                MAX = diff;
            }
        }

        System.out.println(idx);
    }
}
