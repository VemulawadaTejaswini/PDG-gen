import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        Set<Integer> hash_set = new TreeSet<Integer>();
        for (int i = 0; i < K ; i++) {
            if (A + i <= B) {
                hash_set.add(A + i);
            }
        }
        for (int i = 0 ; i < K ; i++) {
            if(B - i>= A) {
                hash_set.add(B - i);
            }
        }
        for (Integer value : hash_set) {
            System.out.println(value);
        }
    }

}
