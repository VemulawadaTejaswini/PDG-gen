import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashMap<Long, Long> map = new HashMap<Long, Long>();
		String[] sa = br.readLine().split(" ");
		long[] a = new long[n];
		int count = 0;
		for (int i = 0; i < n; i++) 
		{
			a[i] = Long.parseLong(sa[i]);
			map.put(a[i], map.getOrDefault(a[i], (long)0)+ 1);
//			System.out.println(map);
		}
		for(Long l: map.keySet())
		{
			if(map.get(l)<l)
				count += map.get(l);
			else
				count += Math.abs(map.get(l)-l);
		}
		System.out.println(count);

	}
}
