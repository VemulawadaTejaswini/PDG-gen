import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = s.nextInt();
        }
        int c1 = 0;
        int c2 = 0;
        
        for (int i = 0; i < 3; i++) {
            if(a[i] == 5) {
                c1 += 1;
            }
            if(a[i] == 7) {
                c2 += 1;
            }
        }

        if(c1 == 2 && c2 == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}