import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.add(a);
            if (a > first) {
                second = first;
                first = a;
            } else if (a > second){
                second = a;
            }
        }

        for (int a : list) {
            if (a < first) {
                System.out.println(first);
            } else {
                System.out.println(second);
            }
        }
    }

}