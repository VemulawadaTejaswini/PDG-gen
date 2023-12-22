import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        if (C < A) {
            int t1 = A;
            int t2 = B;
            A = C;
            B = D;
            C = t1;
            D = t2;
        }
        if (B <= C) {
            System.out.println(0);
            return;
        }
        List<Integer> data = new ArrayList<Integer>();
        data.add(A);
        data.add(B);
        data.add(C);
        data.add(D);
        data.sort(Comparator.naturalOrder());
        int answer = data.get(2)-data.get(1);
        System.out.println(answer);
    }
}
