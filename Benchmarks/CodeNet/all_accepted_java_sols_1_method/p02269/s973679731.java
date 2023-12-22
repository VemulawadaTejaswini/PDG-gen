import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            switch(s) {
            case "insert":
                map.put(sc.next(), "");
                break;
            case "find":
                if (map.containsKey(sc.next())) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
                break;
            }
        }
    }
}