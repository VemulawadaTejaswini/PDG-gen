import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList list1 = new ArrayList<Integer>();
        ArrayList list2 = new ArrayList<Integer>();

        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            list1.add(sc.nextInt());
        }

        for (int i = 0; i < N-1; i++) {
            K = sc.nextInt();
            for (int j = 0; j < K; j++) {
                int A = sc.nextInt();
                if (list1.contains(A)) {
                    list2.add(A);
                }
            }
            list1.clear();
            for (int j = 0; j < list2.size(); j++) {
                list1.add(list2.get(j));
            }
            list2.clear();
        }

        System.out.println(list1.size());
    }
}
