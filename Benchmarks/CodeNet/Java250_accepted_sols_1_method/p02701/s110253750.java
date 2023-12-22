import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> s = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            s.add(sc.next());
        }
        List<String> list = new ArrayList<>(new HashSet<>(s));

        System.out.println(list.size());
    }
}