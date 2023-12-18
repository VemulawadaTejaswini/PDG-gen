import java.util.*;
import java.awt.geom.*;

public class Main{
	String JOI = "JOI";
	String IOI = "IOI";
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			int a = 0, b = 0;
			for(int i = 0; i <= s.length() - 3; i++){
				String sub = s.substring(i, i + 3);
				if(sub.equals(JOI)){
					a++;
				}
				if(sub.equals(IOI)){
					b++;
				}
			}
			System.out.println(a);
			System.out.println(b);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}