
import java.util.*;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> a = new ArrayList<Integer>();
        for (int i=0;i<N;i++) a.add(scan.nextInt());

        Collections.sort(a, Collections.reverseOrder());
        int ans = 0;
        for(int i=0;i<N-1;i++) ans += a.get(i);
        System.out.println(ans);
        }
    }
