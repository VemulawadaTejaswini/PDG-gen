import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i ++){
            int t = scan.nextInt();
            if (set.contains(t)){
                System.out.println("NO");
                return;
            }else
                set.add(t);
        }
        System.out.println("YES");
    }
}
