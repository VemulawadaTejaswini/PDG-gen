import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        while(true){
            int n = stdIn.nextInt();
            int x = stdIn.nextInt();
            if(n == 0 && x == 0)
                break;
            int answer = 0;
            for(int i = 1; i <= n; i++) {
                for(int j = i + 1; j <= n; j++) {
                    for(int k = j + 1; k <= n; k++) {
                        if(i + j + k == x) {
                            answer++;
                        }
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
