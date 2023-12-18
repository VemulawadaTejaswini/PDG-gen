import java.util.*;

public class Main {
	static class Player{
		int num , group;
		double time;
		public Player(){}
		public Player(int g,int n,double t){
			group = g;
			num = n;
			time = t;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Player> list = new LinkedList<Player>();
		Player[] g1 , g2 , g3;
		Player pl = new Player();
		for( int i = 0; i < 24; i++ ) {
			int g = (i+1) / 8;
			int n = sc.nextInt();
			double t = sc.nextDouble();
			Player p = new Player(g,n,t);
			list.add(p);
		}
		Player win , swin;
		for ( int i = 0; i < 3; i++ ) {
			win = list.get(6*i); swin = win;
			for ( int j = 0; j < 8; j++ ) {
				if ( win.time > list.get(6*i+j).time ) {
					swin = win;
					win = list.get(6*i+j);
				} else if ( swin.time > list.get(6*i+j).time )
					swin = list.get(6*i+j);
			}
			System.out.println(win.num+" "+win.time);
			System.out.println(swin.num+" "+swin.time);
			list.remove(win); list.remove(swin);
		}
		win = list.get(0); swin = list.get(0);
		for ( int i = 1; i < list.size(); i++) {
			if ( win.time > list.get(i).time ) {
				swin = win;
				win = list.get(i);
			} else if ( swin.time > list.get(i).time )
				swin = list.get(i);
		}
		System.out.println(win.num+" "+win.time);
		System.out.println(swin.num+" "+swin.time);
	}
}