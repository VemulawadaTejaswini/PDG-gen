import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] data = new int[N];
        for (int i = 0; i < N; i++) {
            data[i] = sc.nextInt();
        }

        int answer = 0;
        for (int i = 0; i < N - 1; i++) {
            if (data[i] == data[i + 1]) {
                answer++;
                i++;
            }
        }
        
        System.out.println(answer);
    }
}
