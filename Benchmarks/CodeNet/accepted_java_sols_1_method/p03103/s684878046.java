import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		long count=0,sum=0,res=0;
		Map<Long, Integer> map = new TreeMap<Long,Integer>();
		for(int i=0;i<n;i++) {
			long key=sc.nextLong();
			int v=sc.nextInt();
			if(map.get(key)==null) {
				map.put(key,v);
			}else {
				map.put(key, map.get(key)+v);
			}
		}
		for(long buff : map.keySet()) {
			count+=map.get(buff);
			if(count<m) {
				sum+=map.get(buff)*buff;
			}else {
				sum+=(map.get(buff)-(count-m))*buff;
				break;
			}
			//System.out.println(buff+" "+map.get(buff));
		}
		System.out.println(sum);
	}
}

