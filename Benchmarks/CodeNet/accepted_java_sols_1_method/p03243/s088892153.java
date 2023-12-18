import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int sim = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;

        for(int i=1; i<=11; i++){
            int tmpDiff = Math.abs(N - 111 * i);

            if(111 * i < N){
                continue;
            }

            if(tmpDiff < diff){
                sim = 111 * i;
                diff = tmpDiff;
            }
        }
        System.out.println(sim);

    }
}
