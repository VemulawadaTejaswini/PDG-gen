import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	private static final Scanner S=new Scanner(System.in);
	private static final PrintStream O=System.out;
	private static final int H=1,K=2;
	
	private static class B {
		private final int i,j;
		
		private B(final int i, final int j) {
			this.i=i;
			this.j=j;
		}
	}
	
	private static class C {
		private final B h[],k;
		private final int m,n;
		
		private C(final B h[], final B k, final int m, final int n) {
			this.h=h;
			this.k=k;
			this.m=m;
			this.n=n;
		}
		
		private class S {
			private final B r;
			private final boolean sp[];
			
			private S(final B r, final boolean sp[]) {
				this.r=r;
				this.sp=sp;
			}
			
			private int hn(final B b) {
				for(int i=0;i<h.length;i++) if(b.i==h[i].i && b.j==h[i].j && sp[i]) return i;
				return -1;
			}
			
			private static final int U=0,D=1,L=2,R=3;
			private boolean b(final int d, S ps[], int np) {
				B pr;
				int hn;
				if(d==U) {
					for(int pi=r.i;(hn=hn(pr=new B(pi,r.j)))<0;pi--) if(pi<=0) return false;
				} else if(d==D) {
					for(int pi=r.i;(hn=hn(pr=new B(pi,r.j)))<0;pi++) if(pi>=n-1) return false;
				} else if(d==L) {
					for(int pj=r.j;(hn=hn(pr=new B(r.i,pj)))<0;pj--) if(pj<=0) return false;
				} else if(d==R) {
					for(int pj=r.j;(hn=hn(pr=new B(r.i,pj)))<0;pj++) if(pj>=m-1) return false;
				} else return false;
				boolean psp[]=sp.clone();
				psp[hn]=false;
				ps[np]=new S(pr,psp);
				return true;
			}
			
			private boolean rk(final int d) {
				if(d==U) {
					for(int pi=r.i;pi!=k.i || r.j!=k.j;pi--) if(pi<=0) return false;
				} else if(d==D) {
					for(int pi=r.i;pi!=k.i || r.j!=k.j;pi++) if(pi>=n-1) return false;
				} else if(d==L) {
					for(int pj=r.j;r.i!=k.i || pj!=k.j;pj--) if(pj<=0) return false;
				} else if(d==R) {
					for(int pj=r.j;r.i!=k.i || pj!=k.j;pj++) if(pj>=m-1) return false;
				} else return false;
				return true;
			}
			
			private boolean cmp(S a) {
				if(r.i!=a.r.i || r.j!=a.r.j) return false;
				for(int i=0;i<sp.length;i++) if(sp[i]!=a.sp[i]) return false;
				return true;
			}
		}
		
		private int getp() {
			int nc=1;
			S cs[]=new S[nc];
			boolean sp[]=new boolean[h.length];
			for(int i=0;i<sp.length;i++) sp[i]=true;
			cs[0]=new S(new B(k.i,k.j), sp);
			int ca[]=new int[cs.length];
			ca[0]=1;
			for(int i=0;i<h.length;i++) {
				long s=System.currentTimeMillis();
				int np=0;
				S ps[]=new S[nc*4];
				int pa[]=new int[ps.length];
				for(int j=0;j<nc;j++) for(int k=0;k<4;k++) if(cs[j].b(k, ps, np)) {
					int l;
					for(l=0;l<np;l++) if(ps[np].cmp(ps[l])) {
						pa[l]+=ca[j];
						break;
					}
					if(l>=np) {
						pa[np]=ca[j];
						np++;
					}
				}
				nc=np;
				cs=ps;
				ca=pa;
				O.println(i+":"+nc+","+(System.currentTimeMillis()-s));
			}
			int a=0;
			for(int i=0;i<nc;i++) for(int j=0;j<4;j++) if(cs[i].rk(j)) a+=ca[i];
			return a;
		}
	}
	
	public static void main(String[] args) {
		int m,n;
		while((m=S.nextInt())!=0 && (n=S.nextInt())!=0) {
			B th[]=new B[23],k=null;
			int nh=0;
			for(int i=0;i<n;i++) for(int j=0;j<m;j++) {
				switch(S.nextInt()) {
					case K:
						k=new B(i,j);
						break;
					case H:
						th[nh++]=new B(i,j);
						break;
				}
			}
			B h[]=new B[nh];
			for(int i=0;i<h.length;i++) h[i]=th[i];
			if(k!=null) O.println(new C(h,k,m,n).getp());
		}
	}
}