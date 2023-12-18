import java.util.*;
import java.text.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);

        for (int i=1; i<n; i++) {
            int tmp = arr[i];
            boolean flag = false;
            for (Integer s: list) {
                if (tmp%s==0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) list.add(tmp);
        }

        if (arr[0]==arr[1]) {
            System.out.println(list.size()-1);
            return;
        }

        System.out.println(list.size());
    }


}
