import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int time = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String song = sc.next();
            time += sc.nextInt();
            map.put(song, time);
        }
        System.out.println(time - map.get(sc.next()));
    }
}