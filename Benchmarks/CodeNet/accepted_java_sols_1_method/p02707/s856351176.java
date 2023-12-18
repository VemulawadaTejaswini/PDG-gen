import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int key = 0;
        int num = 0;
        boolean flag = false;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 1; i < N; i++) {
        	key = sc.nextInt();
        	flag = map.containsKey(key);
        	if(flag) {
        		num = map.get(key);
        		num++;
        		map.put(key, num);
        	} else {
        		map.put(key, 1);
        	}
        }

        for(int j = 1; j <= N; j++) {
        	if(map.get(j) != null) {
        		System.out.println(map.get(j));
        	} else {
        		System.out.println(0);
        	}
        }
    }
}