import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.add(a);
        }
        
        System.out.print(list.get(n-1));
        for(int i = n-2; i >= 0; i--) System.out.print(" " + list.get(i));
        System.out.println();
    }
}
