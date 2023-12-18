import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import javax.swing.*;
import java.awt.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-6;

	int d;
	int n;
	int[] x, h;
	int m;
	int[] f, dv;
	int l;
	int[] p, t;

	void run(){
		d=sc.nextInt();
		for(int k=0; k<d; k++){
			n=sc.nextInt()+1;
			x=new int[n+1];
			h=new int[n+1];
			x[0]=0;
			x[n]=100;
			h[0]=h[n]=50;
			for(int i=1; i<n; i++){
				x[i]=sc.nextInt();
				h[i]=sc.nextInt();
			}
			m=sc.nextInt();
			f=new int[m];
			dv=new int[m];
			for(int i=0; i<m; i++){
				f[i]=sc.nextInt();
				dv[i]=sc.nextInt();
			}
			l=sc.nextInt();
			p=new int[l];
			t=new int[l];
			for(int i=0; i<l; i++){
				p[i]=sc.nextInt();
				t[i]=sc.nextInt();
			}
			solve();
		}
	}

	double[] y, a;
	double time;

	void solve(){
		y=new double[n];
		a=new double[n];
		for(int j=0; j<m; j++){
			for(int i=0; i<n; i++){
				if(x[i]<f[j]&&f[j]<x[i+1]){
					a[i]+=dv[j]/30.0;
				}
			}
		}
		debug("y", y);
		debug("a", a);
		debug("x", x);
		debug("h", h);
		debug();

		// Visualizer v=new Visualizer();

		double[] ans=new double[l];
		fill(ans, -1);

		for(time=0;;){
			double min=INF;
			for(int i=0; i<n; i++){
				if(a[i]>EPS){
					if(y[i]+EPS<h[i]){
						min=min(min, (h[i]-y[i])*(x[i+1]-x[i])/a[i]);
					}
					if(y[i]+EPS<h[i+1]){
						min=min(min, (h[i+1]-y[i])*(x[i+1]-x[i])/a[i]);
					}
				}
			}
			if(min==INF){
				for(;;);
			}
			for(int j=0; j<l; j++){
				if(time<t[j]+EPS&&t[j]+EPS<time+min){
					for(int i=0; i<n; i++){
						if(x[i]<p[j]&&p[j]<x[i+1]){
							ans[j]=min(y[i]+(t[j]-time)*a[i]/(x[i+1]-x[i]), 50);
						}
					}
				}
			}
			boolean all50=true;
			time+=min;
			for(int i=0; i<n; i++){
				y[i]+=min*a[i]/(x[i+1]-x[i]);
				all50&=abs(y[i]-50)<EPS;
			}
			// v.repaint();
			// sleep(4000);

			debug("y", y);
			debug("a", a);
			debug("x", x);
			debug("h", h);

			if(all50){
				break;
			}
			double[] a2=new double[n];

			for(int j=0; j<n; j++){
				boolean[] bottom=new boolean[n];
				int left, right;
				for(left=j; left>=0&&y[left]+EPS>h[left]; left--);
				for(right=j; right<n&&y[right]+EPS>h[right+1]; right++);

				if(y[left]+EPS<y[j]){
					for(int i=left; i<n&&abs(y[i]-y[left])<EPS; i++){
						bottom[i]=true;
					}
				}
				if(y[right]+EPS<y[j]){
					for(int i=right; i>=0&&abs(y[i]-y[right])<EPS; i--){
						bottom[i]=true;
					}
				}
				if(abs(y[left]-y[j])<EPS&&abs(y[right]-y[j])<EPS){
					for(int i=left; i<=right; i++){
						bottom[i]=true;
					}
				}
				int sum=0;
				for(int i=0; i<n; i++){
					if(bottom[i]){
						sum+=x[i+1]-x[i];
					}
				}
				for(int i=0; i<n; i++){
					if(bottom[i]){
						a2[i]+=a[j]/sum*(x[i+1]-x[i]);
					}
				}
			}
			a=a2.clone();
			debug("time", time);
			debug("y", y);
			debug("a", a);
		}
		for(int i=0; i<l; i++){
			println(ans[i]+EPS<0?"50.0":ans[i]+"");
		}
	}

	void sleep(long millis){
		try{
			Thread.sleep(millis);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	void debug(Object... os){
		// System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}

	public class Visualizer extends JFrame{
		Visualizer(){
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			getContentPane().add(new MainPanel(), BorderLayout.CENTER);
			pack();
		}

		class MainPanel extends JPanel{
			MainPanel(){
				setPreferredSize(new Dimension(512, 512));
			}

			public void paintComponent(Graphics g){
				int width=getWidth();
				int height=getHeight();
				for(int i=0; i<n; i++){
					g.setColor(Color.BLUE);
					g.fillRect(x[i]*4, height-(int)(y[i]*4), (x[i+1]-x[i])*4,
							(int)(y[i]*4));
					g.drawString(String.format("%.4f", a[i]), x[i]*4, height/2);
				}

				for(int i=0; i<=n; i++){
					g.setColor(Color.RED);
					g.drawLine(x[i]*4, height-h[i]*4, x[i]*4, height);
				}

				g.setColor(Color.BLACK);
				g.drawString(""+time, 100, 100);
			}
		}
	}
}