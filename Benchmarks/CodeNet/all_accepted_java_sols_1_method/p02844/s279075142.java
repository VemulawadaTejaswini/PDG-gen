
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int res = 0;
        for (char c1 = '0'; c1 <= '9'; c1++) {
            for (char c2 = '0'; c2 <= '9'; c2++) {
                for (char c3 = '0'; c3 <= '9'; c3++) {
                    String c = "";
                    c += c1;
                    c += c2;
                    c += c3;
                    
                    int state = 0;
                    for (int i = 0; i < n; i++) {
                        if (s.charAt(i) == c.charAt(state)) {
                            state++;
                            if(state==3) {
                                res++;
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
}
