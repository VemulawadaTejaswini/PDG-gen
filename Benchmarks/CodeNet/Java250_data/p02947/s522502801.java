import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String,Integer> countMap = new HashMap<>();
        for (int i = 0; i < N ; i++) {
            char[] chars=sc.next().toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            if(!countMap.containsKey(str)){
                countMap.put(str,1);
            }else{
                countMap.put(str,countMap.get(str)+1);
            }
        }

        long ans = 0 ;
        for (int count: countMap.values()) {
            ans += (long) count * (count -1) /2;
        }

        System.out.println(ans);

    }
}
