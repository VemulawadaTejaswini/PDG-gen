import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in).useDelimiter("[^0-9]+");
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int s = sc.nextInt();
			int[] d = new int[10+1];
			boolean[] u = new boolean[10];
			Arrays.fill(d,-1);
			Arrays.fill(u,false);
			int p = n;
			int x = 0;
			d[p] = 9;
			u[d[p]] = true;
			x = d[p]*p;
			boolean f = false;
			int c = 0;
			while(true){
				 if(p>n){
					break;
				}
				if(!f&&x<=s){
					if(p == 1){
						if(x == s){
							c++;
						}
						if(d[p]!=-1){
							x -= d[p]*p;
							u[d[p]] = false;
							d[p] = -1;
						}
						p++;
					} else {
						p--;
					}
					f = true;
				} else {
					f = false;
					int i = 9;
					if(d[p]!=-1){
						x -= d[p]*p;
						i = d[p] -1;
						u[d[p]] = false;
						d[p] = -1;
					}
					for(;i>=0;i--){
						if(!u[i]&&x+i*p<=s){
							d[p] = i;
							u[i] = true;
							x += d[p]*p;
							break;
						}
					}
					if(i<0){
						p++;
						f = true;
					}
				}
			}
			System.out.println(c);
		}
	}
}