import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			int b = a.length();
			char c ;
			int g = 0;
			int e = 0 ;
			int f = 1;
			if (b==1){
				f = Integer.parseInt(a);
			}
			while(f != 0){
				for(int d=0 ; d<b ; d++){
					c = a.charAt(d);
					g = Character.getNumericValue(c);
					e += g;
				}
				System.out.println(e);
				a = sc.next();
				b = a.length();
				if (b==1){
					f = Integer.parseInt(a);
				}
				e = 0;
			}
	}
}