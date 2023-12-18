import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            a.add(tmp);
            sum += tmp;
        }
        Collections.sort(a);
        int xx = x;
        for (int i = 0; i < n; i++) {
            int tmp = a.get(i);
            if(tmp > xx) {
                System.out.println(i);
                return;
            } else {
                xx -= tmp;
            }
        }
        if(sum < x) {
            n--;
        }
        System.out.println(n);
    }
}