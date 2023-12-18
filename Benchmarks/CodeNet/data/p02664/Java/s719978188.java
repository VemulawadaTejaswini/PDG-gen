import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		int count = 0;
		for(int i = 0; i < text.length(); i++) {
			if(String.valueOf(text.charAt(i)).equals("?")) {
				count++;
			}
		}
		String t = "おわとらん";
		int max = 0;
		for(int i = 0; i < 100; i++) {
			String text2 = text;
			for(int j = 0; j < count; j++) {
				text2.replaceFirst("?", getS());
			}
			int score = getPD(text2);
			//System.out.println(count);
			if(score > max) {
				max = score;
				t = text2;
			}
		}
		System.out.println(t);
	}
	
	public static int getPD(String pd) {
		int length = pd.length();
		int count = 0;
		for(int i = 0; i < length; i++) {
			if(i != length - 1) { //最終文字でないなら
				String a = String.valueOf(pd.charAt(i));
				String b = String.valueOf(pd.charAt(i + 1));
				if(a.equals("P")) {
					count++;
				}
				if((a + b).equals("PD")) {
					count++;
				}
			} else {
				String a = String.valueOf(pd.charAt(i));
				if(a.equals("P")) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static String getS() {
		if(new Random().nextBoolean()) {
			return "P";
		} else {
			return "D";
		}
	}
}