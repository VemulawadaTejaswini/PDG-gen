//package AtCoder;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<String,Integer> map=new HashMap<>();
		int n=sc.nextInt();
		int max=1;
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			if(map.containsKey(s))
			{
				int val=map.get(s)+1;
				if(val>max)
					max=val;
				map.put(s,val);
			}
			else
			{
				map.put(s, 1);
			}
		}
		Set<String> set=new TreeSet<>();
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			if(entry.getValue()==max)
				set.add(entry.getKey());
		}
		List<String> list=new ArrayList<>(set);
		for(String str:list)
		{
			System.out.println(str);
		}

	}

}
