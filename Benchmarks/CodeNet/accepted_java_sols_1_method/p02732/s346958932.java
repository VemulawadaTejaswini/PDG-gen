import static java.lang.System.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int N = sc.nextInt();
        int[] a = new int [N];
        int[] count = new int[200001];
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<N; i++) {
            int num = sc.nextInt();
            a[i] = num;
            count[num] += 1;
            set.add(num);
        }
        long ans = 0;
        ArrayList<Integer> list = new ArrayList<>(set);
        for (int j=0; j<list.size(); j++) {
            int cnum = count[list.get(j)];
            ans += ((long)cnum*(long)(cnum-1)/2);
        }
        for (int k=0; k<N; k++)
            out.println(ans-(count[a[k]]-1));
    }
}