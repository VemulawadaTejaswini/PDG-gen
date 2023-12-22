import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("AC", 0);
        map.put("WA", 0);
        map.put("TLE", 0);
        map.put("RE", 0);
        while (N-- > 0) {
            String s = sc.next();
            map.put(s, map.get(s) + 1);
        }

        System.out.println("AC x " + map.get("AC"));
        System.out.println("WA x " + map.get("WA"));
        System.out.println("TLE x " + map.get("TLE"));
        System.out.println("RE x " + map.get("RE"));
    }
}
