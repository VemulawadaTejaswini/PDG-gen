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
			t += x.length();
			if(q[t - 1].equals("."))
				break;
		}
		for(i = 0;;i++){
			if(q[i].equals("."))
				System.out.print(q[i]);
			else
				System.out.print(q[i]+" ");
		if(q[i].equals("."))
			break;
		}
	}
		
}
	
		


	