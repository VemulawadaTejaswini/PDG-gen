import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	private static final Scanner S=new Scanner(System.in).useDelimiter("\\s*,\\s*|\\s+");
	private static final PrintStream O=System.out;
	
	private static class Seal {
		private final double x;
		private final double y;
		private final Ols ols[];
		private int nol=0;
		private int col=0;
		private int mol=0;
		
		private static class Ols {
			private final double arg[]=new double[2];
			private final Ols ols[];
			private int nol=0;
			private int mol=0;
			
			private Ols(final int mol) {
				ols=new Ols[mol];
			}
			
			private static double subArg(double a, final double b) {
				a-=b;
				a%=(2*Math.PI);
				if(a<0) a+=(2*Math.PI);
				return a;
			}
			
			private void jolol(final Ols a) {
				double rarg=subArg(arg[1],arg[0]);
				double d0=subArg(a.arg[0],arg[0]);
				double d1=subArg(a.arg[1],arg[0]);
				if(d0<=rarg) {
					ols[nol]=new Ols(nol);
					ols[nol].arg[0]=a.arg[0];
					if(d1<=rarg) ols[nol].arg[1]=a.arg[1];
					else ols[nol].arg[1]=arg[1];
					smol();
				} else if(d0>d1) {
					ols[nol]=new Ols(nol);
					ols[nol].arg[0]=arg[0];
					if(d1<=rarg) ols[nol].arg[1]=a.arg[1];
					else ols[nol].arg[1]=arg[1];
					smol();
				}
			}
			
			private void smol() {
				for(int i=0;i<nol;i++) ols[nol].jolol(ols[i]);
				int tol;
				if((tol=ols[nol].mol+1)>mol) mol=tol;
				nol++;
			}
		}
		
		private Seal(final double x, final double y, final int mol) {
			this.x=x;
			this.y=y;
			ols=new Ols[mol];
		}
		
		private void jol(final Seal a) {
			final double dx=a.x-x;
			final double dy=a.y-y;
			final double sqds=Math.pow(dx,2)+Math.pow(dy,2);
			if(sqds>4) return;
			if(sqds==0) {
				col++;
				return;
			}
			final double marg=Math.atan2(dy, dx);
			final double rarg=Math.acos(Math.sqrt(sqds/4));
			ols[nol]=new Ols(nol);
			ols[nol].arg[0]=marg-rarg;
			ols[nol].arg[1]=marg+rarg;
			for(int i=0;i<nol;i++) ols[nol].jolol(ols[i]);
			int tol;
			if((tol=ols[nol].mol+1)>mol) mol=tol;
			nol++;
		}
	}
	
	public static void main(String[] args) {
		final Seal seal[]=new Seal[100];
		int n,mol;
		
		while((n=S.nextInt())!=0) {
			mol=1;
			for(int i=0;i<n;i++) seal[i]=new Seal(S.nextDouble(), S.nextDouble(), n);
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) seal[i].jol(seal[j]);
				int tol;
				if((tol=seal[i].mol+seal[i].col)>mol) mol=tol;
			}
			O.println(mol);
		}
	}
}