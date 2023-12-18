import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int l = sc.nextInt();
			if (n == 0) {
				break;
			}
			ArrayList<Ant> a = new ArrayList<Ant>();
			for(int i=0;i<n;i++) {
				a.add(new Ant(i+1, sc.next().charAt(0) == 'L' ? -1 : 1, sc.nextInt() * 2)); 
			}
			int step = 0;
			Ant last = null;
			while(!a.isEmpty()) {
				int m = a.size();
				for(Ant x: a) {
					x.pos += x.dir;
				}
				for(int i=0;i<m;i++) {
					Ant x = a.get(i);
					for(int j=i+1;j<m;j++) {
						Ant y = a.get(j);
						if (x.pos == y.pos && x.pos % 2 == 0) {
							x.dir *= -1;
							y.dir *= -1;
							break;
						}
					}
				}
				for (Iterator<Ant> it = a.iterator(); it.hasNext();) {
					Ant x = it.next();
					if (x.pos >= l * 2) {
						last = x;
						it.remove();
					}
				}
				for (Iterator<Ant> it = a.iterator(); it.hasNext();) {
					Ant x = it.next();
					if (x.pos <= 0) {
						last = x;
						it.remove();
					}
				}
				step++;
			}
			System.out.println(step/2 + " " + last.id);
		}

		
	}
	
	static class Ant {
		int id,dir,pos;
		public Ant(int id,int dir,int pos) {
			this.id = id;
			this.dir = dir;
			this.pos = pos;
		}
	}

}