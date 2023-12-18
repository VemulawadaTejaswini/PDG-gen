import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            
            if (n == 0 && r == 0) break;
            list.clear();
            
            for (int i = 0; i < n; i++) {
                list.add(i+1);
            }
            
            for (int i = 0; i < r; i++) {
                int p = sc.nextInt();
                int c = sc.nextInt();
                for (int j = 0; j < c; j++) {
                    list.add(list.remove(n-p-c+1));
                }
            }
            
            System.out.println(list.get(n-1));
        }
    }
}