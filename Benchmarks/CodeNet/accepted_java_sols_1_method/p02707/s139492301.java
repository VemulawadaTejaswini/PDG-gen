import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N - 1; i++) {
            int n = in.nextInt();
            if(map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        for(int i = 0; i < N; i++) {
            int n = i + 1;
            if(map.containsKey(n)) {
                System.out.println(map.get(n));
            } else {
                System.out.println(0);
            }
        }
    }

}
