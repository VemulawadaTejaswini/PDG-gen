import java.util.*;



class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        int m;

        int q;

        

        n = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = scanner.nextInt();

        }

        

        q = scanner.nextInt();

        for (int i = 0; i < q; i++) {

            m = scanner .nextInt();

            if (exhaustive(a, m, 0)) {

                System.out.println("yes");

            } else {

                System.out.println("no");

            }

        }

    }

    

    static boolean exhaustive(int[] a, int m, int current) {

        if (m == 0) {

            return true;

        }

        if (m < 0 || current == a.length) {

            return false;

        }

        

        if (exhaustive(a, m, current+1) || exhaustive(a, m - a[current], current+1)) {

            return true;

        }

        return false;

    }

}
