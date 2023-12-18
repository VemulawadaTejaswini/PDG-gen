import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();	
	}

	public Main() {
		while(sc.hasNext()){
			new aoj1153().doIt();
		}
	}
	class aoj1153 {
		String ans(int a[],int b[]){
			int asum = 0;
			int bsum = 0;
			int sum = Integer.MAX_VALUE;
			for(int i = 0;i < a.length;i++)asum = asum + a[i];
			for(int i = 0;i < b.length;i++)bsum = bsum + b[i];
			String result = "-1";
			for(int i = 0;i < a.length;i++){
				for(int j = 0;j < b.length;j++){
					if(asum - a[i] + b[j] == bsum - b[j] + a[i]){
						if(a[i] + b[j] < sum){
							result = a[i]+" "+b[j];
							sum = a[i] + b[j];
						}
					}
				}
			}
			return result;
		}
		void doIt() {
			while(true){
				int n = sc.nextInt();
				int m = sc.nextInt();
				if(n+m == 0)break;
				int a[] = new int [n];
				int b[] = new int [m];
				for(int i = 0;i < n;i++)a[i] = sc.nextInt();
				for(int i = 0;i < m;i++)b[i] = sc.nextInt();
				System.out.println(ans(a,b));
			}
		}
	}
}