

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(sc.nextInt(), i + 1);
        }
        for (int i = 1; i <= n; i++) {
            if (i != 1) {
                System.out.print(" ");
            }
            System.out.print(map.get(i));
        }
        sc.close();
    }
}