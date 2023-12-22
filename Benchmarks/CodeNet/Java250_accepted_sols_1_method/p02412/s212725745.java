import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()) {
            int n = s.nextInt();
            int x = s.nextInt();
            if(n == 0 && x ==0) break;
            int c = 0;
            for(int i = 1; i <= n; ++i) {
                for(int j = i + 1; j <= n; ++j) {
                    for(int k = j + 1; k <= n; ++k) {
                        if(i + j + k == x) {
                            c++;
                            break;
                        } else if(i + j + k > x) {
                            break;
                        }
                    }
                    if(i + j * 2 > x) break;
                }
                if(i * 3 > x) break;
            }
            System.out.println(c);
        }
    }
}