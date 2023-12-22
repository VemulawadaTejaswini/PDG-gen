import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        String ans = "NO";
        if (a[0] == 5 && a[1] == 5 && a[2] == 7) ans = "YES";
        System.out.println(ans);
    }
}