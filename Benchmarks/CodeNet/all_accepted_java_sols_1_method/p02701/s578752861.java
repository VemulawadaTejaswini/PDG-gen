import java.util.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        Set<String> set = new HashSet<String>();
        for(int i=0;i<N;i++) {
            set.add(sc.next());
        }
        List<String> list = new ArrayList<String>(set);
        System.out.println(list.size());
    }
}
