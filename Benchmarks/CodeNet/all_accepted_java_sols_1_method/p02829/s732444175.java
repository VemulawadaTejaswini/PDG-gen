import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] num = {1, 2, 3};
        num[A-1] = 0;
        num[B-1] = 0;

        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i])
                max = num[i];
        }
        System.out.println(max);
    }
}
