import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        TreeMap<Long, Long> map = new TreeMap<>();
        for(int i = 0; i < n; i++) {
        	long a = scan.nextLong();
        	long b = scan.nextLong();
        	if(map.containsKey(a)) {
        		map.put(a, map.get(a) + b);
        	}else {
        		map.put(a, b);
        	}
        }

        long ans = 0;
        for(long i: map.keySet()) {
        	if(m >= map.get(i)) {
        		ans += i * map.get(i);
        		m -= map.get(i);
        	}else {
        		ans += i * m;
        		m -= m;
        	}

        	if(m ==0)
        		break;
        }
        System.out.println(ans);
    }
}