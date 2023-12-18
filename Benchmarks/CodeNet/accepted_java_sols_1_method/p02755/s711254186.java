import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);

        Integer a = Integer.parseInt(scanner.next());
        Integer b = Integer.parseInt(scanner.next());

        Long ar = 0L;
        Long br = 0L;
        boolean a_result = true;

        Long count = 10L;
        Long end = 0L;
        while(true) {
            Integer tmp_b = (int) Math.floor(count * 0.1);
            if(tmp_b == b) {
                br = count;
                end = count + 10;
                break;
            }
            count += 10;
        }

        if((int) Math.floor(count * 0.08) > a ) {
            System.out.println(-1);
            System.exit(0);
        }

        for(Long i = count; i < end; i++) {
            Integer tmp_a = (int) Math.floor(i* 0.08);
            if(tmp_a == a){
                ar = i;
                break;
            }

            if (i == end -1) {
                System.out.println(-1);
                System.exit(0);
            }
        }

        System.out.println(ar);
    }
}
