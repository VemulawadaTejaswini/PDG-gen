import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) A.add(scan.nextInt());

        Collections.sort(A);
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (A.get(i).equals(A.get(j)) || A.get(j).equals(A.get(k))) continue;
                    if (Math.abs(A.get(i) - A.get(j)) < A.get(k) && A.get(k) < A.get(i) + A.get(j)) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
