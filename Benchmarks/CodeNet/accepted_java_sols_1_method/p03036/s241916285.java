
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int D = sc.nextInt();
        int x2000 = sc.nextInt();
        int p;

        for(int i=1;i<11;i++){
            p =r*x2000-D;
            System.out.println(p);
            x2000=p;
        }

    }
}