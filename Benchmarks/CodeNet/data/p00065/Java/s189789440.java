//Volume0-0065
import java.util.*;

class Cnt {
	public int     cnt = 1;
	public boolean both;
}

public class Main {

	public static void main(String[] args) {

		//declare
		TreeMap<Integer,Cnt> map = new TreeMap<Integer,Cnt>();
		Cnt     e;
		String  s;
		int     num;
		boolean flg = false;

		//input
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			if((s = sc.nextLine()).equals("")){
				flg = true;
				continue;
			}
			num = Integer.parseInt(s.split(",")[0]);
			
			//calculate
			if(map.containsKey(num)){
				e = map.get(num);
				e.cnt++;
				if(flg){e.both = flg;}
			} else if (!flg){
				map.put(num,new Cnt());
			}
		}

		//output
		Iterator<Map.Entry<Integer, Cnt>> I;
		I = map.entrySet().iterator();
		while(I.hasNext()){
			Map.Entry<Integer, Cnt> m = (Map.Entry<Integer, Cnt>)I.next();
			if(m.getValue().both){
				System.out.println(m.getKey()+" "+m.getValue().cnt);
			}
		}
	}
}