import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        boolean ok = false;
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] + a[i - 1] >= l) {
                ok = true;
                index = i;
                break;
            }
        }
        if (!ok) {
            System.out.println("Impossible");
            return;
        }
        System.out.println("Possible");
        for (int i = 1; i < index; i++) {
            System.out.println(i);
        }
        for (int i = n - 1; i > index; i--) {
            System.out.println(i);
        }
        System.out.println(index);
    }
}
