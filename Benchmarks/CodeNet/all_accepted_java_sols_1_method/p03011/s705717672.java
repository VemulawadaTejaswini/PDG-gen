import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        
        out.println(Math.min(Math.min(p+q, p+r), q+r));
    }
}

