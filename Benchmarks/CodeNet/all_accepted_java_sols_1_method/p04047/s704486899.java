import java.awt.List;
import java.util.*;
public class Main {
	static int modNum = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		int ans = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1;i<=a*2;i++){
			int b = sc.nextInt();
			list.add(b);
		}
		Collections.sort(list);

		for(int i = 0;i<list.size();i++){
			if(i%2==0){
				ans += list.get(i);				
			}
		}
		System.out.println(ans);
		sc.close();
	}
}