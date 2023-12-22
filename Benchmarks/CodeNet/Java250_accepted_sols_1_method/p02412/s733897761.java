import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while(true) {
            int n = scn.nextInt();
            int x = scn.nextInt();
            if(n == 0 && x == 0) {
                break;
            }
            int c = 0;
            for(int i = n; i > 2; i--) {
                for(int j = ~-i; j > 1; j--) {
                    for(int k = ~-j; k > 0; k--) {
                        if(i + j + k == x) {
                            c++;
                        }
                    }
                }
            }
            System.out.println(c);
        }
    }
}