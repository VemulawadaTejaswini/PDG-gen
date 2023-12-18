import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        for (int i = 1; 9 >= i; i++) {
            for (int l = 1; 9 >= l; l++) {
                int result = l*i;
                System.out.printf("%dx%d=%d", i, l, result);
                System.out.println();
            }
        }
    }
}

