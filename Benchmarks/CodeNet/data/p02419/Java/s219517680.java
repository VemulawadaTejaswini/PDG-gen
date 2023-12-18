import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String w = scan.next();
		String lw = w.toLowerCase();
		String sw[] = lw.split("");
		int i,m,t,ti;
		ti = 0;
		for(;;){
			String s = scan.next();
			String ls = s.toLowerCase();
			String ss[] = ls.split("");
			if(s.equals("END_OF_TEXT"))
				break;
				t = 0;
			for(m = 0; m < w.length(); m++){
				if(s.length() < w.length() || s.length() != w.length())
					break;
				if(ss[m].equals(sw[m]))
					t++;			
				}
				if(t == w.length())
					ti++;
			}
		System.out.println(ti);
		}
	}

		

	