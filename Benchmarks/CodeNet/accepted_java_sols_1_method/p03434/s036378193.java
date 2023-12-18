import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
		}
	//	System.out.println(a.get(0));
	//	System.out.println(a);
		Collections.sort(a);
	//	System.out.println(a);
		int alice = 0;
		int bob = 0;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				alice += a.get(n-i-1);
			}else {
				bob += a.get(n-i-1);
			}
		}
	//	System.out.println(alice);
	//	System.out.println(bob);
		System.out.println(alice-bob);
	}

}
