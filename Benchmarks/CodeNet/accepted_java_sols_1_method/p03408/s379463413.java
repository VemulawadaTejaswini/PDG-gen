import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		HashMap<String,Integer> map=new HashMap<>();
		map.put("#",0);
		for(int n=s.nextInt();n>0;--n)
			map.merge(s.next(),1,Integer::sum);
		for(int m=s.nextInt();m>0;--m)
			map.merge(s.next(),-1,Integer::sum);
		System.out.println(
				map.values().stream()
						.mapToInt(i->i)
						.max().getAsInt());
	}
}
