import java.util.*;
import java.util.Map.Entry;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		Hashtable<String,Integer> vals = new Hashtable<String, Integer>();
		while (sc.hasNext()) {
			String m = sc.next();
			if(vals.containsKey(m)){
				vals.put(m,vals.get(m)+1);
			}else{
				vals.put(m,0);
			}
			if(vals.size()>5)break;
		}
		
		ArrayList<Entry<String,Integer>> valList=new ArrayList<Entry<String,Integer>>(vals.entrySet());
			
		Collections.sort(valList,new Comparator<Entry<String,Integer>>() {
@Override
		public int compare(Entry<String, Integer> o1,
				Entry<String, Integer> o2) {
			return o2.getValue()-o1.getValue();
		}
		});
		String mode=valList.get(0).getKey();
	
		Collections.sort(valList,new Comparator<Entry<String,Integer>>() {
			@Override
					public int compare(Entry<String, Integer> o1,
							Entry<String, Integer> o2) {
						return o2.getKey().length()-o1.getKey().length();
					}
		});
		String lng=valList.get(0).getKey();
		
		ln(mode+" "+lng);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}