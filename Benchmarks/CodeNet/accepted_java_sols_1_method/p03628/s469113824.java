import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s1 = sc.next().toCharArray();
        char[] s2 = sc.next().toCharArray();
        List<Integer> list = new ArrayList<>();
       list.add(1);
       for (int i = 0 ; i < n - 1 ; i++ ) {
           if (s1[i] == s1[i + 1]) {
               list.set(list.size() - 1, 2);
           } else {
               list.add(1);
           }
        }

       long ans = list.get(0) == 1 ? 3 : 6;
       for (int i = 0 ; i < list.size() - 1 ; i++) {
           if (list.get(i) == 1 && list.get(i + 1) == 1) {
               ans *= 2;
           } else if (list.get(i) == 1 && list.get(i + 1) == 2) {
               ans *= 2;
           } else if (list.get(i) == 2 && list.get(i + 1) == 1) {
           } else {
               ans *= 3;
           }
       }
       System.out.println(ans % 1000000007);
    }

}