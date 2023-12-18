import java.util.*;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		Map<Integer,Integer> m=new TreeMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			Integer aObj=Integer.valueOf(a);
			if(m.containsKey(aObj)) {
				m.put(aObj,m.get(aObj)+1);
			}
			else {
				m.put(aObj, 1);
			}
		}
		Collection<Integer> nums=m.values();
		List<Integer> l=new ArrayList<Integer>();
		l.addAll(nums);
		java.util.Collections.sort(l);
		int count=l.size();
		int ans=0;
		while(count>k) {
			ans+=l.get(l.size()-count);
			count--;
		}
		System.out.println(ans);
	}

}
