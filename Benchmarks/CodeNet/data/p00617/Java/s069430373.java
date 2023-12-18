
import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.math.BigInteger.*;
public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void debug(Object...os){
		System.err.println(deepToString(os));
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		for(;;){
			int n=sc.nextInt();
			if(n==0)return;
			p=0;
			Panel root = new Panel(sc.next());
			for(int i=0;i<n;i++){
				if(!root.go(sc.nextInt(), sc.nextInt())){
					System.out.println("OUT OF MAIN PANEL 1");
				}
			}
		}
	}
	int p;
	class Panel{
		String name;
		int x1,y1,x2,y2;
		ArrayList<Panel> cs = new ArrayList<Panel>();
		Panel(String t){
			String s = t.substring(p);
			int np = s.indexOf(">");
			name = s.substring(1, np);
//			p = np;
//			p++;
			int q = s.indexOf("<", np);
			String[] ns = s.substring(np+1, q).split(",");
			x1 = Integer.valueOf(ns[0]);
			y1 = Integer.valueOf(ns[1]);
			x2 = Integer.valueOf(ns[2]);
			y2 = Integer.valueOf(ns[3]);
			p += q;
			while(!t.substring(p).startsWith("</")){
				cs.add(new Panel(t));
			}
			p = t.indexOf(">",p) + 1;
		}
		boolean go(int x,int y){
			if(x1<=x&&x<=x2&&y1<=y&&y<=y2){
				boolean me = true;
				for(Panel p:cs){
					if(p.go(x, y))me=false;
				}
				if(me){
					System.out.println(name + " "+cs.size());
				}
				return true;
			}
			else return false;
		}
	}
}