import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] res = new int[N];
        for (int i = 0; i < res.length - 1; i++) {
            int index = sc.nextInt() - 1;
            res[index]++;
        }
        for (int i : res) {
            System.out.println(i);
        }
        sc.close();
    }
}