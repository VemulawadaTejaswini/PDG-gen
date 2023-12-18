import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		sc.close();
		long yono = 1;
		for(int i = 2 ; i <= n ; i++){
			boolean sos = true;
			for(int j = 2 ; sos && j <= Math.sqrt(i) ; j++){
				if(i % j == 0) sos = false;
			}
			if(sos){
				int now = n;
				long so = 1;
				while(now != 0){
					so += now / i;
					now /= i;
				}
				yono *= so;
				yono %= 1000000007;
			}
		}
		ou.print(yono + "\n");
		ou.flush();
    }
}