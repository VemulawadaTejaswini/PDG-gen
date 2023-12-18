import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 1 ; i <= Math.sqrt(m) ; i++) {
            if (m % i == 0) {
                set.add(m / i);
                set.add(i);
            }
        }
        //setにはいっている数字のなかでNより大きい最小の数字をだしたい。
        for (Integer num : set) {
            if (num >= n) {
                System.out.println(m / num);
                return;
            }
        }
    }

}