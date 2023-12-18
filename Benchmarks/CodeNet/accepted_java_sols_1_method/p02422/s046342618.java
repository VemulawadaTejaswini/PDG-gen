import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String[] c;
		c = new String[10000];
		String x = scan.next();
		String mj[] = x.split("");
		int a = scan.nextInt();
		int i,m,b;
		for(i = 1; i <= a; ++i){
			b = 0;
			String str = scan.next();
			int q = scan.nextInt();
			int w = scan.nextInt();
			
			if(str.equals("replace")){
				String e = scan.next();
				String j[] = e.split("");
				for(m = q; m <= w; ++m){
					mj[m] = j[b++];
				}
			}
				else if(str.equals("reverse")){
				for(m = q; m <= w; ++m){
					c[b++] = mj[m];
				}
				b = 0;
				for(m = w; m >= q; --m){
					mj[m] = c[b++];
				}
				}
				else if(str.equals("print")){
				for(m = q; m <= w; ++m){
					System.out.print(mj[m]);
				}
				System.out.println("");
				}
			}
		}
	}