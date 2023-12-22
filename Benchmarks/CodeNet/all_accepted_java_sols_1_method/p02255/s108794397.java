import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] list = new int[N];
        for(int i = 0; i < N; i++) System.out.print((list[i] = scanner.nextInt()) + (i== N-1?"\n":" "));
 
        for(int i = 1; i < N; i++) {
            int v = list[i];
            int j = i - 1;
            while(j >= 0 && list[j] > v) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = v;
            for(int n : list) System.out.print(n + (n == list[N - 1] ? "\n" : " "));
        }
 
        scanner.close();
    }
}
