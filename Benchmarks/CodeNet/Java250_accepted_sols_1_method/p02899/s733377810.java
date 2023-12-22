import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        Map<Integer, Integer> A = new HashMap<Integer, Integer>();
        for(int i=0; i < N; i++){
            A.put(sc.nextInt(),i+1);
        }


        for(int i = 1; i < N+1; i++){
            System.out.println(A.get(i));
        }
    }
}