
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true){
			int H = Integer.parseInt(stdIn.next());
			int R = Integer.parseInt(stdIn.next());
			if(H==0 && R==0){
				break;
			}
			int[] hx = new int[H];
			int[] hy = new int[H];
			for(int i=0;i<H;i++){
				hx[i] = Integer.parseInt(stdIn.next());
				hy[i] = Integer.parseInt(stdIn.next());
			}
			int U = Integer.parseInt(stdIn.next());
			int M = Integer.parseInt(stdIn.next());
			int S = Integer.parseInt(stdIn.next());
			int du = Integer.parseInt(stdIn.next());
			int dm = Integer.parseInt(stdIn.next());
			int ds = Integer.parseInt(stdIn.next());
			int[] ux = new int[U];
			int[] uy = new int[U];
			int[] mx = new int[M];
			int[] my = new int[M];
			int[] sx = new int[S];
			int[] sy = new int[S];
			for(int i=0;i<U;i++){
				ux[i] = Integer.parseInt(stdIn.next());
				uy[i] = Integer.parseInt(stdIn.next());
			}
			for(int i=0;i<M;i++){
				mx[i] = Integer.parseInt(stdIn.next());
				my[i] = Integer.parseInt(stdIn.next());
			}
			for(int i=0;i<S;i++){
				sx[i] = Integer.parseInt(stdIn.next());
				sy[i] = Integer.parseInt(stdIn.next());
			}
			int[] w = new int[R];
			int[] a = new int[R];
			for(int i=0;i<R;i++){
				w[i] = Integer.parseInt(stdIn.next());
				a[i] = Integer.parseInt(stdIn.next());
			}

			int[] Hcount = new int[H];
			int count_max = 0;

			for(int i=0;i<H;i++){
				IN:for(int j=0;j<R;j++){
						if(!func(0,0,hx[i],hy[i],a[j],w[j],du)){
							continue;
						}
					for(int k=0;k<U;k++){
						if(func(ux[k],uy[k],hx[i],hy[i],a[j],w[j],du)){
							continue IN;
						}
					}
					for(int l=0;l<M;l++){
						if(func(mx[l],my[l],hx[i],hy[i],a[j],w[j],dm)){
							continue IN;
						}
					}
					for(int m=0;m<S;m++){
						if(func(sx[m],sy[m],hx[i],hy[i],a[j],w[j],ds)){
							continue IN;
						}
					}
					Hcount[i]++;
					out.println(j);
					out.flush();
				}
				if(count_max<Hcount[i]){
					count_max = Hcount[i];
				}
			}

			if(count_max>0){
				for(int i=0;i<H;i++){
					//out.print(Hcount[i]+" ");
					//out.flush();
					if(Hcount[i] == count_max){
						out.print(i+1);
						if(i!=H-1){
							out.print(" ");
						}
						out.flush();
					}
					if(i==H-1){
						out.println();
						out.flush();
					}
				}
			}
			else{
				out.println("NA");
				out.flush();
			}
		}
	}

	static boolean func(int nx,int ny,int hx,int hy,int a,int w,int du){
		Line2D.Double v1 = new Line2D.Double(nx,ny,nx+(double)a*Math.cos(Math.PI*((double)w-(double)du/2.0)/180.0)
			,ny+(double)a*Math.sin(Math.PI*((double)w-(double)du/2.0)/180.0));
		Line2D.Double v2 = new Line2D.Double(nx,ny,nx+(double)a*Math.cos(Math.PI*((double)w+(double)du/2.0)/180.0)
			,ny+(double)a*Math.sin(Math.PI*((double)w+(double)du/2.0)/180.0));
		if(v1.relativeCCW(hx,hy)==0 || v2.relativeCCW(hx,hy)==0 
				|| (Math.sqrt(hx*hx+hy*hy)<=(double)a && v1.relativeCCW(hx,hy)==-1 && v2.relativeCCW(hx,hy)==1 )){
			return true;						
		}
		return false;
	}
}