import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] aArr = sc.next().toCharArray();
        char[] bArr = sc.next().toCharArray();
        char[] cArr = new char[n * 2];
        for (int i = 0; i < n; i++) {
            cArr[i * 2] = aArr[i];
            cArr[i * 2 + 1] = bArr[i];
        }
        System.out.println(cArr);
    }
}