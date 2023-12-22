import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(sc.nextInt());
        Collections.sort(list);

        for (int i = 0; i < n-1; i++) {
            if (list.get(i).equals(list.get(i+1))) {
              System.out.println("NO"); 
              return;
            }
        }
        System.out.println("YES");
    }
}