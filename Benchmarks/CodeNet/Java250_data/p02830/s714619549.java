import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        String x[] = scanner.next().split("");
        String y[] = scanner.next().split("");



        String str = new String();
        for(int i = 0; i < n; i++) {
            str += x[i] + y[i];
        }

        System.out.println(str);
    }
}
