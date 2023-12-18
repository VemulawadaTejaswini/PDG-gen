import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	private static final Scanner S=new Scanner(System.in);
	private static final PrintStream O=System.out;
	private static final int H=1,K=2;
	private static final int U=0,D=1,L=2,R=3;
	
	private static class B {
		private final int i,j;
		
		private B(final int i, final int j) {
			this.i=i;
			this.j=j;
		}
	}
	
	private static class C {
		private final int nh,bh[][][],nbh[][];
		
		private C(final B h[], final int m, final int n) {
			int nh=h.length;
			bh=new int[nh][4][nh];
			nbh=new int[nh][4];
			for(int i=0;i<4;i++) for(int j=0;j<nh;j++) nbh[j][i]=0;
			for(int i=0;i<nh;i++) for(int j=0;j<nh;j++) {
				if(i==j) continue;
				if(h[i].i==h[j].i) {
					if(h[i].j<h[j].j) bh[j][L][nbh[j][L]++]=i;
					else bh[j][R][nbh[j][R]++]=i;
				} else if(h[j].j==h[i].j) {
					if(h[i].i<h[j].i) bh[j][U][nbh[j][U]++]=i;
					else bh[j][D][nbh[j][D]++]=i;
				}
			}
			this.nh=nh-1;
		}
		
		private class S {
			private final int r;
			private final boolean sp[];
			
			private S(final int r, final boolean sp[]) {
				this.r=r;
				this.sp=sp;
			}
			
			private boolean b(final int d, S ps[], int np) {
				int pr=0;
				boolean f=false;
				if(d==D || d==R) {
					for(int i=0;i<nbh[r][d];i++) if(sp[(pr=bh[r][d][i])]) {
						f=true;
						break;
					}
				} else if(d==U || d==L) {
					for(int i=nbh[r][d]-1;i>=0;i--) if(sp[(pr=bh[r][d][i])]) {
						f=true;
						break;
					}
				}
				if(f) {
					boolean psp[]=sp.clone();
					psp[pr]=false;
					ps[np]=new S(pr,psp);
					return true;
				}
				return false;
			}
			
			private boolean tumi() {
				for(int i=0;i<nh;i++) if(sp[i] && tumih(i)) return true;
				if(tumik()) return true;
				return false;
			}
			
			private boolean tumih(final int i) {
				for(int j=0;j<4;j++) for(int k=0;k<nbh[i][j];k++) if(sp[bh[i][j][k]] || bh[i][j][k]==r) return false;
				return true;
			}
			
			private boolean tumik() {
				for(int j=0;j<4;j++) for(int k=0;k<nbh[nh][j];k++) if(sp[bh[nh][j][k]]) return false;
				return true;
			}
			
			private boolean tumi2() {
				for(int j=0;j<4;j++) for(int k=0;k<nbh[nh][j];k++) if(bh[nh][j][k]==r) return false;
				return true;
			}
		}
		
		private int getp() {
			int nc=1;
			S cs[]=new S[nc];
			boolean sp[]=new boolean[nh+1];
			for(int i=0;i<nh;i++) sp[i]=true;
			sp[nh]=false;
			cs[0]=new S(nh, sp);
			int ca[]=new int[cs.length];
			ca[0]=1;
			for(int i=0;i<nh;i++) {
				int np=0;
				S ps[]=new S[nc*4];
				int pa[]=new int[ps.length];
				for(int j=0;j<nc;j++) for(int k=0;k<4;k++) if(cs[j].b(k, ps, np)) {
					if(i<nh-1 && ps[np].tumi()) continue;
					if(i>=nh-1 && ps[np].tumi2()) continue;
					pa[np]=ca[j];
					np++;
				}
				nc=np;
				cs=ps;
				ca=pa;
			}
			int a=0;
			for(int i=0;i<nc;i++) a+=ca[i];
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
			B h[]=new B[nh+1];
			for(int i=0;i<nh;i++) h[i]=th[i];
			h[nh]=k;
			O.println(new C(h,m,n).getp());
		}
	}
}