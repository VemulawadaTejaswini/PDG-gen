import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(a);
        if (a[0] == 5 && a[1] == 5 && a[2] == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}