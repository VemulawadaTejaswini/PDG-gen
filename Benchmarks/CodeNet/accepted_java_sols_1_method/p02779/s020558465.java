import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
        	int num = sc.nextInt();
        	if(set.contains(num)) {
        		System.out.println("NO");
        		return;
        	}
        	set.add(num);
        }

        System.out.println("YES");
    }
}
