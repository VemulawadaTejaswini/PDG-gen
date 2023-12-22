import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 0;
        for(int i = 1; i <= N; i++) {
            String s = String.valueOf(i);
            int len = s.length();
            if(len % 2 != 0) res++;
        }
        System.out.println(res);
    }
}
