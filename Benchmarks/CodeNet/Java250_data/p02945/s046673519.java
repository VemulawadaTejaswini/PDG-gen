import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        List<Integer> a = Arrays.asList(A + B, A - B, A * B);
        a.sort(Comparator.reverseOrder());
        System.out.println(a.get(0));
    }
}