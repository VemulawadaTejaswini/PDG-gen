import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int search = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == search) {
                list.add(search);
                search++;
            }
        }
        if (list.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(N - list.size());
        }
        sc.close();
    }
}