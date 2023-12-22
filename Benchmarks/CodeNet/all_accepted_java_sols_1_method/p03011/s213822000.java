import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] s = new int[3];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextInt();
        }
        Arrays.sort(s);
        System.out.println(s[0] + s[1]);
    }
}