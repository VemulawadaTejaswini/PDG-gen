import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	private static final Scanner S=new Scanner(System.in).useDelimiter("\\s*,\\s*|\\s+");
	private static final PrintStream O=System.out;
	private static final double EPS=0.00001*4;
	
	private static class Seal {
		private double x;
		private double y;
		private int nOl=1;
		
		public Seal(double x, double y) {
			this.x=x;
			this.y=y;
		}
		
		private double sqds(Seal a) {
			return Math.pow(x-a.x,2)+Math.pow(y-a.y,2);
		}
		
		private boolean ol(Seal a) {
			if(sqds(a)-4<=EPS) return true;
			return false;
		}
	}
	
	public static void main(String[] args) {
		Seal seal[]=new Seal[100];
		int n,max;
		
		while((n=S.nextInt())!=0) {
			for(int i=0;i<n;i++) {
				seal[i]=new Seal(S.nextDouble(), S.nextDouble());
				for(int j=i-1;j>=0;j--) {
					if(seal[i].ol(seal[j])) {
						seal[i].nOl+=seal[j].nOl;
						break;
					}
				}
			}
			max=0;
			for(int i=0;i<n;i++) {
				if(max<seal[i].nOl) max=seal[i].nOl;
			}
			O.println(max);
		}
	}
}