import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		while(true) {
			int n = Integer.parseInt(as.next());
			if(n == 0) {
				break;
			}
			HashMap<String, Integer> b = new HashMap<String, Integer>();
			for(int i=0;i<n;i++) {
				b.put(as.next(), Integer.parseInt(as.next()));
			}
			int m = Integer.parseInt(as.next());
			HashMap<String, String[]> c = new HashMap<String, String[]>();
			for(int i=0;i<m;i++) {
				String cc = as.next();
				int mm = Integer.parseInt(as.next());
				String[] d = new String[mm];
				for(int j=0;j<mm;j++) {
					d[j] = as.next();
				}
				c.put(cc, d);
			}
			String t = as.next();
			int sub;
			for(int i = 0; i<c.size(); i++) {
				for(String ccc: c.keySet()){
					sub = 0;
					for(String dd: c.get(ccc)) {
						sub += b.get(dd);
					}
					b.put(ccc, Math.min(b.get(ccc), sub));
				}
			}
			System.out.println(b.get(t));
		}
	}
}
