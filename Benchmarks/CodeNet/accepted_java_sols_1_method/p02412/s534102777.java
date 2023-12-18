import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n==0&&x==0)break;
            int answer = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n && i + 2 * j + 1 <= x; j++) {
                    if (j <= x - i - j && x - i - j <= n) answer++;
                }
            }
            System.out.println(answer);
        }
    }
}

