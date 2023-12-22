import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());

        Integer[] p = new Integer[n];
        for(int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(scanner.next());
        }

        int count = 0;
        for(int i = 1; i < n -1; i++) {
            if(p[i-1] < p[i] != p[i] > p[i+1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}