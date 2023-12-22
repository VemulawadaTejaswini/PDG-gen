
import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer x = Integer.parseInt(scanner.next());
        Integer y = Integer.parseInt(scanner.next());
        Integer[] hito = new Integer[x];

        for(int i = 0; i < x; i++) {
            hito[i] = Integer.parseInt(scanner.next());
        }

        int count = 0;
        for(int i= 0; i < x; i++) {
            if (hito[i] >= y) count++;

        }
        System.out.println(count);
    }
}