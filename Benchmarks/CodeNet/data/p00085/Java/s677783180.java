import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj0085().doIt();
	}
	class aoj0085{
		void doIt() {
			while(true){
				int n = sc.nextInt();
				int s = sc.nextInt();
				if(n + s == 0)break;
				int a[] = new int [n+1];
				a[0] = 1;
				int cnt = 0;
				int num = 0;
				int out = 1;
				while(true){
					if(cnt == n-1)break;
					if(a[out] == 0){
						num++;
						if(num == s){
							a[out]++;
							cnt++;
							num = 0;
						}
					}
					out = (out + 1) % (n+1); 
				}
				for(int i = 1;i <= n;i++){
					if(a[i] == 0)System.out.println(i);
				}
			}
		}
	}
}