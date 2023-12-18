import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Integer> paper = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (paper.contains(a)) {
                paper.remove(a);
            } else {
                paper.add(a);
            }
        }
        System.out.println(paper.size());
    }
}
