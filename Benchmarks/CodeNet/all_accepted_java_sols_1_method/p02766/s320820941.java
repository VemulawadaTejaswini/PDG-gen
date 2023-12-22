import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer x = Integer.parseInt(scanner.next());
        Integer y = Integer.parseInt(scanner.next());

        List<Integer> total = new ArrayList<Integer>();
        int count =0;
        int warizan = x;
        for(;;) {
            if (warizan < y) {
                count++;
                break;
            }
            int zyouyo = x % y;
            warizan = warizan / y;
            count++;
        }
        System.out.println(count);
    }
}