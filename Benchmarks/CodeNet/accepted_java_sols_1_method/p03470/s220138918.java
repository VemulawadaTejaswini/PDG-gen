import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < N; i++) {
            s.add(sc.nextInt());
        }
        System.out.println(s.size());
    }
}