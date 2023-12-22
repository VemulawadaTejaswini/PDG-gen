import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int a = 100 * A / 8;
        if (((100 * A)%8 != 0)) {
            a++;
        }
        int ap = 100 * (A+1) / 8;
        if ((100 * (A+1))%8 == 0) {
            ap--;
        }
        int b = 10 * B;
        int bp = 10 * (B+1);
        List<Integer> in = new ArrayList<>();
        List<Integer> out = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = a;i <= ap;i++) {
            in.add(i);
        }
        for (int i = b; i < bp;i++) {
            out.add(i);
        }
        for (Integer i :out) {
            if (in.contains(i)) {
                ans.add(i);
            }
        }
        if (ans.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(ans.get(0));
        }
    }
}