import java.util.*;
import java.awt.geom.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int w = sc.nextInt();
			int d = sc.nextInt();
			if(n==0 && w==0 && d==0) break;
			
			Rectangle2D.Double[] r = new Rectangle2D.Double[n+2];
			for(int i=0;i<n+2;i++) r[i] = new Rectangle2D.Double();
			r[1].setRect(0, 0, w, d);
			
			int p, s, x, y, a, b;
			for(int i=2;i<=n+1;i++){
				p = sc.nextInt();
				s = sc.nextInt();
				
				x = (int)r[p].getX();
				y = (int)r[p].getY();
				w = (int)r[p].getWidth();
				d = (int)r[p].getHeight();
				s = s%(2*w+2*d);
				a = i;
				
				if(s<w){
					if(s<=w/2){
						b = a;
						a = p;
						p = b;
					}
					r[a].setRect(x, y, s, d);
					r[p].setRect(x+s, y, w-s, d);
				}else if(w<s && s<w+d){
					s -= w;
					if(s<=d/2){
						b = a;
						a = p;
						p = b;
						
					}
					r[a].setRect(x, y, w, s);
					r[p].setRect(x, y+s, w, d-s);
				}else if(w+d<s && s<2*w+d){
					s = 2*w+d-s;
					if(s<=w/2){
						b = a;
						a = p;
						p = b;
					}
					r[a].setRect(x, y, s, d);
					r[p].setRect(x+s, y, w-s, d);
				}else{
					s = 2*w+2*d-s;
					if(s<=d/2){
						b = a;
						a = p;
						p = b;
					}
					r[a].setRect(x, y, w, s);
					r[p].setRect(x, y+s, w, d-s);
				}
			}
			int[] ans = new int[n+1];
			for(int i=1;i<=n+1;i++) ans[i-1] = (int)(r[i].getWidth()*r[i].getHeight());
			Arrays.sort(ans);
			
			for(int i=0;i<n+1;i++){
				if(i!=0) System.out.print(" ");
				System.out.print(ans[i]);
			}
			System.out.println();
		}	
	}	
}