import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  Integer.parseInt(sc.next());
		List l = new ArrayList<Integer>(n);

		for(int i = 0 ; i < n ; i++) {
			l.add(Integer.parseInt(sc.next()));
		}
		l.sort(Comparator.reverseOrder());
		int ans = 0;
		for (int i = 0 ; i < n ; i++ ) {	
			for (int j = i +1 ; j < n ; j++ ) {	
				for (int k = j +1 ; k < n ; k++ ) {
					int a = (int) l.get(i);
					int b = (int) l.get(j);
					int c = (int) l.get(k);
					if(a < b + c ) {
						ans++;
					}else {
						break;
					}
				}





			}
		}
		System.out.println(ans);

	}
}