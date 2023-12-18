import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	class C implements Comparable<C>{
		String s;
		int freq;
		
		public C(String s, int freq) {
			this.s = s;
			this.freq = freq;
		}

		@Override
		public int compareTo(C o) {
			if(this.freq < o.freq) return 1;
			else if(this.freq > o.freq) return -1;
			return this.s.compareTo(o.s);
		}
		
	}

	private void doit() {
		while (true) {
			int n = Integer.parseInt(sc.nextLine());
			if(n == 0)break;
			String [][] data = new String [n][];
			for(int i = 0; i < n; i++){
				data[i] = sc.nextLine().split(" ");
			}
			char c = sc.nextLine().charAt(0);
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for(int i = 0; i < n; i++){
				for(int j = 0; j < data[i].length; j++){
					if(c == data[i][j].charAt(0)){
						if(map.containsKey(data[i][j])){
							map.put(data[i][j], map.get(data[i][j]) + 1);
						}
						else{
							map.put(data[i][j], 1);
						}
					}
				}
			}
			ArrayList<C> list = new ArrayList<Main.C>();
			for(String str: map.keySet()){
				list.add(new C(str, map.get(str)));
			}
			Collections.sort(list);
			if(list.size() == 0){
				System.out.println("NA");
				continue;
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < Math.min(5, list.size()); i++){
				sb.append(" " + list.get(i).s);
			}
			System.out.println(sb.substring(1));
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}