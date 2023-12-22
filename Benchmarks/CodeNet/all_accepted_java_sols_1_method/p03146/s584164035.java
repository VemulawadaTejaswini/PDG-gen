import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        set.add(s);
        s = s % 2 == 0 ? s / 2: s * 3 + 1;
        while (!set.contains(s)) {
            set.add(s);
            s = s % 2 == 0 ? s / 2: s * 3 + 1;
        }
        System.out.println(set.size()+1);

    }
}