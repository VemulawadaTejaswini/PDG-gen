import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.next());
        }

        boolean flag = true;
        int count = 0;
        while (true) {
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                for (int i = 0; i < n; i++) {
                    a[i] = a[i] / 2;
                }
            } else {
                break;
            }
        }
        System.out.println(count);

    }
}