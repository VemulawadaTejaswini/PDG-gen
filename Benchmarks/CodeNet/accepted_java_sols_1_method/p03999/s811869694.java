import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length() - 1;
        long sum = 0;
        for (int i = 0 ; i < (Math.pow(2,  n)); i++) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(0);
            for (int j = 0 ; j < n ; j++) {
                if ((1 & i >> j) == 1) {
                    list.add(j + 1);
                }

            }
            list.add(s.length());
            for (int k = 0 ; k < list.size() - 1 ; k++) {
                long num = Long.valueOf(s.substring(list.get(k), list.get(k + 1)));

                sum += num;
            }
        }
        System.out.println(sum);
    }

}