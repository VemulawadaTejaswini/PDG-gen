import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0) {
                System.out.print(" " + i);
            }else {
                for(int j = i; j > 0; j /=10) {
                    if(j % 10 == 3) {
                        System.out.print(" " + i);
                        break;
                    }
                }
            }
        }
        System.out.println();
    }
}
