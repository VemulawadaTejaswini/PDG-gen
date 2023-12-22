import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Map<String, Integer> dic = new TreeMap<>();
        int N = sc.nextInt();
        sc.nextLine();

        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            if (s.contains(tmp)) {
                System.out.println("NO");
                System.exit(0);
            } else {
                s.add(tmp);
            }
        }
        System.out.println("YES");
    }
}
