import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }

        int res = 0;

        for (int i=0; i<N; i++) {

            while (i+1 < N && a[i] == a[i+1]) {
                i++;
            }

            if (i+1 < N && a[i] < a[i+1]) {
                while (i+1 < N && a[i] <= a[i+1]) {
                    i++;
                }
            } else if(i+1 < N && a[i] > a[i+1]) {
                while (i+1 < N && a[i] >= a[i+1]) {
                    i++;
                }
            }
            res++;
        }
        System.out.println(res);
    }
}

