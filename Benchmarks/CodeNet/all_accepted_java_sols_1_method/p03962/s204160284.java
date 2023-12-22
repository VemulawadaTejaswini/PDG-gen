import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 3; i++) {
            set.add(in.nextInt());
        }
        System.out.println(set.size());
    }
}
