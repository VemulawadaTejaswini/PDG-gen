import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<>();
        String blank = sc.nextLine();
        for (int i=0; i<n; i++) {
          String str = sc.nextLine();
          set.add(str);
        }
        System.out.println(set.size());
    }
}
