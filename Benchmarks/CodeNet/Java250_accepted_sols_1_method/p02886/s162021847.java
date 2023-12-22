import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        List<Integer> takoyaki = new ArrayList<>();
        int ans = 0;
        for (int i = 0; i < number; i++) {
            takoyaki.add(sc.nextInt());
        }
        for (int i = 0; i < number; i++) {
            for (int j = i + 1; j < number; j++) {
                ans += takoyaki.get(i) * takoyaki.get(j);
            }
        }
        System.out.println(ans);
    }
}