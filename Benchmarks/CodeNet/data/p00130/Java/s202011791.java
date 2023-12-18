import java.util.*;

public class Main {
	static String getTrain( String s ) {
		ArrayList<String> train = new ArrayList<String>();
		int p = 0;
		for ( int i = 0; i < s.length(); i++ ) {
			char t = s.charAt(i);
			if ( t == '<' ){
				if ( p > 0 ) p--;
			} else if ( t == '>' ) {
				p++;
			} else {
				if ( train.indexOf(t+"") < 0 )
					train.add(p,t+"");
			}
		}
		String result = "";
		for ( int i = 0; i < train.size(); i++ ) {
			result += train.get(i);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for ( int i = 0; i <= n; i++ ) {
			String line = sc.nextLine().replace("-", "");
			System.out.println(getTrain(line));
		}
	}
}