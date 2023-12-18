import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Long, Long> map = new HashMap<>();

        for(int i = 0;i < n;i++) {
            long ai = sc.nextLong();
            Optional<Long> value = Optional.ofNullable(map.get(ai));
            if(value.isPresent()) map.put(ai, value.get() + 1);
            else map.put(ai, 1L);
        }

        
        System.out.println(map.keySet().stream().mapToLong(map::get).filter(e -> e % 2 == 1).count());
    }

}
