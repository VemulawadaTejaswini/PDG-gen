import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set set = new HashSet<Integer>();
        for(int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            set.add(tmp);
        }
        System.out.println(set.size());
    }
}