import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    static boolean check(long a, long b, long c){
        return a < b+c && b < a+c && c < a+b;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        String[] s = sc.nextLine().split("\\s");
        long[] arr = Arrays.stream(s).mapToLong(Long::parseLong).toArray();
        Map<Long, Integer> count = new HashMap<>(); 
        for (long a: arr){
            count.put(a, count.getOrDefault(a, 0) + 1);
        }
        Long[] keys = count.keySet().stream().sorted().toArray(Long[]::new);
        long a, b, c, ans = 0;
        for (int i=0; i<keys.length; i++){
            a = keys[i];
            for (int ii=i+1; ii<keys.length; ii++){
                b = keys[ii];
                for (int iii=ii+1; iii<keys.length; iii++){
                    c = keys[iii]; 
                    if (check(a, b, c)){
                        ans += count.get(a)*count.get(b)*count.get(c);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}