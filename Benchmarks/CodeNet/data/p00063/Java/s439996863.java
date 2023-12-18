import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		while(sc.hasNext()){
			String t = sc.next();
			int i=0;
			for(; i<t.length()/2; i++)
				if(t.charAt(i) != t.charAt(t.length()-1-i)){break;}
			if(i==(t.length()-1)/2) cnt++;
		}
		System.out.println(cnt);

	}

}