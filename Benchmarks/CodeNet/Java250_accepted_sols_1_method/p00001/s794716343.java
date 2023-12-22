import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Integer arrays[] = new Integer[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            arrays[i] = sc.nextInt();
        }
        Arrays.sort(arrays, Comparator.reverseOrder());
        for (int i = 0; i < 3; i++) {
            System.out.println(arrays[i]);
        }
    }
}