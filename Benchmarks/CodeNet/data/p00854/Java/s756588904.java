import java.util.*;
public class Main { 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true) {
			int n = stdIn.nextInt();
			int k = stdIn.nextInt();
			int m = stdIn.nextInt();
			if(n == 0 && k == 0 && m == 0) break;
			list = new ArrayList<Integer>();
			for(int i = 0; i < n; i++) {
				list.add(i+1);
			}
			int nowp = m-1;
			list.remove(nowp);
			n-=1;
			while(n != 1) {
				nowp += k-1;
				nowp %= n;
				list.remove(nowp);
				n--;
			}
			
			System.out.println(list.get(0));
		}
	}
}