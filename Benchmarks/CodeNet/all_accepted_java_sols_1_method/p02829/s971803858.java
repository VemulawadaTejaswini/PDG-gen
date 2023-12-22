import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] a = new boolean[3];
        for (int i = 0; i < 2; i++) {
            a[sc.nextInt() - 1] = true;
        }
        for(int i = 0; i < 3; i++) {
            if (!a[i])
                System.out.println(i + 1);
        }
    }
}