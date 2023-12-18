import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i,m,t,b;
		String q[] = new String[1200];
		t = 0;
		for(;;){
			b = 0;
			String x = scan.next();
			String ux = x.toUpperCase();
			String lx = x.toLowerCase();
			String w[] = x.split("");
			String uw[] = ux.split("");
			String lw[] = lx.split("");
			for(i = t; i < t + x.length(); i++){
				if(w[b].equals(uw[b]))
					q[i] = lw[b];
				else
					q[i] = uw[b];
				++b;
			}
			q[i] = "air";
			t += x.length() + 1;
			if(q[t - 2].equals("."))
				break;
		}
		for(i = 0;;i++){
			if(q[i].equals("air"))
				System.out.print(" ");
			else if(q[i].equals(".")){
				System.out.print(".");
				break;
			}
			else
				System.out.print(q[i]);
		}
	}
		
}
	
		


	