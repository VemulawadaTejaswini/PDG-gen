import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x = sc.nextInt();
        int[] as = new int[N];

        for (int i=0; i<N; i++) {
            as[i] = sc.nextInt();
        }
        Arrays.sort(as);
        int sum = 0;

        for (int i=0; i<N; i++) {
            x -= as[i];
            if (x < 0) {
                break;
            }
            sum++;
        }
        if (x > 0) {
            sum--;
        }

        System.out.println(sum);
    }
}

