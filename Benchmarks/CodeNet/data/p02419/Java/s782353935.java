import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String w = scan.next();
		String sw[] = w.split("");
		int i,m,t,ti;
		ti = 0;
		for(;;){
			String s = scan.nextLine();
			String ss[] = s.split("");
			if(s.equals("END_OF_TEXT"))
				break;
			for(i = 0; i <= s.length() - w.length(); i++){
				t = 0;
				for(m = 0; m < w.length(); m++){
					if(ss[i + m].equals(sw[m]))
						t++;		
				}
				if(t == w.length())
					ti++;
			}
		}
		System.out.println(ti);
	}
}
		

	