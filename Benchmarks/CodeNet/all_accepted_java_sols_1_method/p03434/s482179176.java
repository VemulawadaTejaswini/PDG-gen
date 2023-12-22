import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int alice = 0;
        int bob = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<num; i++){
            int n = sc.nextInt();
            list.add(n);
        }

        int count = 1;

        while(list.size() != 0){
            int ans = Collections.max(list);

            if(count % 2 != 0){
                alice += ans;
            } else {
                bob += ans;
            }

            count++;
            list.remove(list.indexOf(Collections.max(list)));
        }

        System.out.println(alice - bob);
    }
}
