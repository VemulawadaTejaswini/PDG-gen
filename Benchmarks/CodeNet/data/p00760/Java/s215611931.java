import java.util.*;

public class Main {
    
    static int mille(int y, int m) {
        if(y%3 == 0) return 20;
        else {
            if(m%2 == 0) return 19;
            else return 20;
        }
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            while(n-- != 0) {
                int y = sc.nextInt();
                int m = sc.nextInt();
                int d = sc.nextInt();
                int dif = mille(y, m) - d + 1;
                for(int i=m+1; i<=10; i++) {
                    dif += mille(y, i);
                }
                for(int i=y+1; i<1000; i++) {
                    for(int j=1; j<=10; j++) {
                        dif += mille(i, j);
                    }
                }
                System.out.println(dif);
            }
        }
    }
}

