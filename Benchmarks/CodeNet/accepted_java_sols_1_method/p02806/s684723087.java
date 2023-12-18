import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		List<String> s=new ArrayList<String>();
		List<Integer> t=new ArrayList<Integer>();
		int result=0;
		for(int i=0;i<n;i++) {
			s.add(sc.next());
			t.add(sc.nextInt());
		}
		String x=sc.next();
		int cc=0;
		for(cc=0;cc<n;cc++) {
			if(x.equals(s.get(cc))) {
				break;
			}
		}
		for(int i=cc+1;i<n;i++) {
			result+=t.get(i);
		}
		System.out.println(result);
		sc.close();
	}
}