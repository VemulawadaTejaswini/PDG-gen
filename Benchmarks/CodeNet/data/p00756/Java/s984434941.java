import java.awt.Color;
import java.awt.Graphics;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.Box.Filler;

public class Main {
	Coin[] coins;
	Scanner sc = new Scanner(System.in);
	int n;
	byte[] state;
	Visualizer vis;
	
	void run() {
//		vis = new Visualizer();
		while (true) {
			n = sc.nextInt();
			if( n == 0 ) break;
			coins = new Coin[n];
			for(int i=0;i<n;i++) coins[i] = new Coin();
			int S=(1<<n)-1;
			state = new byte[1<<n];
			for(int i=0;i<(1<<n);i++) state[i] = -1;
			System.out.println(solve(S));
		}
	}
	
	byte solve( int S ) {
	//	System.out.println(S);
		if (state[S] >= 0) return state[S];
		boolean[] lapped = new boolean[n];
		analyseLapped(S, lapped);
//		for(int i=0;i<n;i++) System.out.print((S>>i)&1);
//		System.out.println();
//		vis.setS(S);
//		vis.repaint();
//		sc.next();
		byte cnt = 0;
		for(int i=0;i<n;i++) {
			if( lapped[i] ) continue;
			for(int j=i+1;j<n;j++) {
				if ( !lapped[j] && coins[i].c == coins[j].c ) {
					cnt = (byte) Math.max(cnt, solve(S-((1<<i) + (1<<j)))+2);
				}
			}
		}
		return state[S] = cnt;
	}
	
	void analyseLapped(int S, boolean[] lapped) {
		for(int i=0;i<n;i++) lapped[i] = false;
		for(int i=0;i<n;i++) {
//			System.out.println( (S>>i) & 1 );
			if( ((S>>i) & 1) != 1 ) { lapped[i] = true ; continue; }
			for(int j=i+1;j<n;j++) {
//				System.out.println(coins[i].isLapped(coins[j]));
				if( coins[i].isLapped(coins[j]) ) lapped[j] = true;
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	class Coin {
		int x, y, r, c;
		
		public Coin() {
			scan();
		}
		
		void scan() {
			x = sc.nextInt();
			y = sc.nextInt();
			r = sc.nextInt();
			c = sc.nextInt();
		}
		
		boolean isLapped( Coin c ) {
			return (c.x-x)*(c.x-x)+(c.y-y)*(c.y-y) < (r+c.r)*(r+c.r);
		}
	}
	class Visualizer extends JFrame {
		int offset = 100;
		int S;
		Visualizer () {
			this.setSize(300, 300);
			this.setVisible(true);
			S = 1<<n-1;
		}
		void setS(int S) {
			this.S = S;
		}
		public void paint(Graphics g) {
			g.clearRect(0, 0, 300, 300);
			for(int i=n-1;i>=0;i--) {
				if(((S>>i)&1) == 1 )oval(coins[i], g);
			}
		}
		Color[] colors = {Color.black, Color.BLUE, Color.red, Color.gray, Color.green, Color.yellow};
		void oval (Coin c, Graphics g) {
			g.setColor(colors[c.c-1]);
			g.fillOval(offset+c.x-c.r, offset+c.y-c.r, 2*c.r, 2*c.r);
			g.setColor(Color.white);
			g.drawOval(offset+c.x-c.r, offset+c.y-c.r, 2*c.r, 2*c.r);
		}
	}
}