import java.util.*;

public class Main {

    public static List<List<Integer>> switchList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        sc.close();

        int[] array = new int[3];
        array[0] = P;
        array[1] = Q;
        array[2] = R;

        Arrays.sort(array);

        System.out.println(array[0] + array[1]);
    }

}