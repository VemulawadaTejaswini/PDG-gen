import java.util.*;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			list.add(n);
			sc.close();
			while(true) {
			if(n%2==1) {
				n = n*3+1;
				if(list.contains(n)) {
					break;
				}
				else {
					list.add(n);
				}
			}
			else {
				n= n/2;
				if(list.contains(n)) {
					break;
				}
				else {
				list.add(n);
				}
			}
			}	
			int res = list.size()+1;
			System.out.println(res);
	}
		
	
	public static void main(String[] args) {
		solve();

	}

}