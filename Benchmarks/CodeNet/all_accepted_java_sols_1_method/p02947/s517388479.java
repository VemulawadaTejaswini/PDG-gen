import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0; i < n; i++){
			s[i] = sc.next();
		}
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(int i = 0; i < n; i++){
			int[] a = new int[10];
			for(int j = 0; j < 10; j++){
				a[j] = s[i].charAt(j);
			}
			Arrays.sort(a);
			String b = "";
			for(int j = 0; j < 10; j++){
				b=b + a[j] + " ";
			}
			if(map.containsKey(b)){
				map.put(b,map.get(b)+1);
			}else{
				map.put(b,0);
			}
		}
		long ans = 0;
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			for(long i = map.get(key); i > 0; i--){
				ans+=i;
			}
		}
		System.out.print(ans);
	}
}
