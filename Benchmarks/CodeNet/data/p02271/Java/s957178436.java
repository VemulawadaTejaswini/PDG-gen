import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    static List<Integer> list = new ArrayList<>();
    static HashMap<Integer, Integer> ans = new HashMap<>();
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        calc(0, 0);
        
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            if (ans.containsKey(sc.nextInt())) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
    
    static void calc(int rep, int sum) {
        if (rep == list.size()) {
            ans.put(sum, sum);
            return;
        }
        int val = list.get(rep);
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                calc(rep + 1, sum + val);
            } else {
                calc(rep + 1, sum);
            }
        }
    }
}