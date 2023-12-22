import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] items = {"01","02","03","04","05","06","07","08","09","10","11","12"};
		List<String> l = Arrays.asList(items);
		String s = sc.nextLine();
		String mae = s.substring(0, 2);
		String ushiro = s.substring(2,4);
		String ans = null;
		if(l.indexOf(mae) >=0  && l.indexOf(ushiro) >=0) {
			ans="AMBIGUOUS";
		}else if(l.indexOf(mae)>=0) {
			ans="MMYY";
		}else if(l.indexOf(ushiro)>=0) {
			ans="YYMM";
		}else {
			ans ="NA";
		}
		System.out.println(ans);
	}
}