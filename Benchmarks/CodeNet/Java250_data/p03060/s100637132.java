import java.util.*;
import java.io.*;

public class Main {

    private static int solver(Integer N, Integer[] values, Integer[] costs){
        Integer results = 0;
        for (int i = 0; i < N; i++) {
            if(values[i] > costs[i]){
                results += values[i] - costs[i];
            }
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        Integer N = in.nextInt();
        Integer[] values = new Integer[N];
        Integer[] costs = new Integer[N];
        for (int i = 0; i < N; i++) {
            values[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            costs[i] = in.nextInt();
        }
        System.out.println(solver(N, values, costs));


    }
}
