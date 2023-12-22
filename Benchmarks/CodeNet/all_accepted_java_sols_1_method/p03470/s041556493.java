import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] d = new String[n];
		String [] dd = new String[n];
		int count = 0;
		for(int i = 0; i < n; i++) {
			d[i] = sc.next();
			dd[i] = "0";
		}
		for(int i = 0; i < n; i++) {
			boolean same = true;
			for(int j = 0; j < n;j++) {
				if(d[i].equals(dd[j])) {
					same = false;
					break;
				}
			}
			dd[i] = d[i]; 
			if(same)count++;
		}
		System.out.println(count);
		sc.close();
	}

}
