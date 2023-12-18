import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++)
            a[i] = sc.nextInt();

        long answer = 0;
        for(int i = 1; i < N; i++) {
            if(a[i] >= a[i - 1])
                continue;
            else {
                answer += a[i - 1] - a[i];
                a[i] = a[i - 1];
            }
        }

        System.out.println(answer);
    }

}
