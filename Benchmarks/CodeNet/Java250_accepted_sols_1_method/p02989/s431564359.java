import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> dList = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
            dList.add(d);
        }
        Collections.sort(dList);
        sc.close();

        int count = dList.get(N / 2) - dList.get(N / 2 - 1);
        System.out.println(count);

    }
}