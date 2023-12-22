import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Map<String,Integer> mp = new HashMap<String,Integer>();
		long ans=0;
		for(int i=0;i<n;i++) {
			char c[]=sc.next().toCharArray();
			Arrays.sort(c);
			String s=String.valueOf(c);
			if(!mp.containsKey(s)) {
				mp.put(s,0);
			}else {
				int num=mp.get(s)+1;
				ans+=num;
				mp.put(s, num);
			}
		}
		System.out.println(ans);
	}

}