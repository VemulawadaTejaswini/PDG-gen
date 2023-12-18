import java.util.*;

class C{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args){
		int x;
		HashMap<String, String> conversions = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		while((x=Integer.parseInt(s.next()))!=0) {
			conversions.clear();
			sb.delete(0, sb.length());
			for(int i=x;i>0;--i) {
				conversions.put(s.next(), s.next());
			}
			for(int i=Integer.parseInt(s.next());i>0;--i) {
				String str = s.next();
				if(conversions.get(str)!=null)
					str=conversions.get(str);
				sb.append(str);
			}
			System.out.println(sb);
		}
	}
}