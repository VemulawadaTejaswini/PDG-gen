import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        Set<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < k; i++) {
            int d = Integer.parseInt(sc.next());
            for (int j = 0; j < d; j++) {
                int a = Integer.parseInt(sc.next());
                s.add(a);
            }
        }
        int c = n - s.size();
        System.out.println(c);
    }
}