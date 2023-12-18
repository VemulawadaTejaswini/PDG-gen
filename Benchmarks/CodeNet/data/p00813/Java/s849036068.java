import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//GIGA Universe Cup
public class Main{

	//`[ð\·NX
	//¿ADiff,S[ÌDæÅ\[gÅ«é
	class R implements Comparable<R>{
		int id, nobattle, point, goal, diff;
		boolean concerned;
		int[] get, lose;
		public R(int id) {
			this.id = id;
			get = new int[4];
			lose = new int[4];
		}
		//SÌÌÊðgÁÄA¿ADiff, S[ðvZ
		void calc1(){
			point = goal = diff = 0;
			for(int i=0;i<4;i++){
				if(id==i)continue;
				point += get[i]>lose[i]?3:get[i]==lose[i]?1:0;
				goal += get[i];
				diff += get[i]-lose[i];
			}
		}
		//¯¶ÊÌ`[¯mÌÊðgÁÄA¿ADiffAS[ðvZ
		void calc2(){
			if(!concerned)return;
			point = goal = diff = 0;
			for(int i=0;i<4;i++){
				if(id==i||!teams[i].concerned)continue;
				point += get[i]>lose[i]?3:get[i]==lose[i]?1:0;
				goal += get[i];
				diff += get[i]-lose[i];
			}
		}
		public int compareTo(R o) {
			return point!=o.point?o.point-point:diff!=o.diff?o.diff-diff:o.goal-goal;
		}
	}

	//ListÌÉfÆ¢¤`[ª¢é©
	boolean exist(int f, List<R> list){
		for(R r:list)if(r.id==f)return true;
		return false;
	}

	// é`[ÌWÌÅ(d),(e),(f)Ì\[gðµA»ÌÅÅà¬ÑÌÇ¢`[ðÔ·
	//ÊÍXÉ¯ÊÉÈè¤éÌÅXgÅ é
	List<R> ranking(List<R> list){
		List<R> res = new ArrayList<R>();
		for(int i=0;i<4;i++)teams[i].concerned = false;
		R[] t = new R[list.size()];
		for(int i=0;i<list.size();i++){
			t[i] = list.get(i);
			t[i].concerned = true;
		}
		for(int i=0;i<list.size();i++)t[i].calc2();
		Arrays.sort(t);
		res.add(t[0]);
		for(int i=1;i<list.size();i++)if(t[0].compareTo(t[i])==0)res.add(t[i]);
		return res;
	}

	//`[4Â
	R[] teams;
	
	//
	double win(int f){
		double res = 0;
		R[] tmp = new R[4];
		for(int i=0;i<4;i++)tmp[i]=teams[i];
		for(int i=0;i<4;i++)tmp[i].calc1();
		Arrays.sort(tmp);
		List<R> first = new ArrayList<R>();
		first.add(tmp[0]);
		for(int i=1;i<4;i++)if(tmp[0].compareTo(tmp[i])==0)first.add(tmp[i]);
		if(first.size()==2){
			res = exist(f, first)?1:0;
		}
		else if(first.size()>=2){
			if(!exist(f, first)){
				return 0;
			}
			List<R> t = new ArrayList<R>();
			for(R r:first)t.add(r);
			for(;;){
				int pre = t.size();
				t = ranking(t);
				if(t.size()==2){
					res = exist(f, t)?1:0;
					break;
				}
				if(t.size()==1){
					if(exist(f, t))return 1;
					int p = t.get(0).id;
					t = new ArrayList<R>();
					for(R r:first)if(p!=r.id)t.add(r);
					t = ranking(t);
					for(;;){
						int size = t.size();
						t = ranking(t);
						if(t.size()==1){
							return res = exist(f, t)?1:0;
						}
						if(size==t.size()){
							return res = exist(f, t)?(1.0/size):0;
						}
					}
				}
				else if(pre==t.size()){
					return exist(f, t)?(2.0/pre):0;
				}
			}
		}
		else{
			if(exist(f, first))return 1;
			List<R> t = new ArrayList<R>();
			t.add(tmp[1]);
			for(int i=2;i<4;i++)if(tmp[1].compareTo(tmp[i])==0)t.add(tmp[i]);
			for(;;){
				int size = t.size();
				t = ranking(t);
				if(t.size()==1){
					res = exist(f, t)?1:0;
					break;
				}
				if(size==t.size()){
					res = exist(f, t)?(1.0/size):0;
					break;
				}
			}
		}
		return res;
	}

	void run(){
		int[] fact = new int[9];
		fact[0]=1; for(int i=1;i<=8;i++)fact[i]=fact[i-1]*i;
		double[] gain = new double[9];
		for(int i=0;i<=8;i++)gain[i]=fact[8]/fact[i]/fact[8-i]*Math.pow(0.25, i)*Math.pow(0.75, 8-i);
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T--!=0){
			String[] table = new String[5];
			teams = new R[4];
			for(int i=0;i<4;i++)teams[i]=new R(i);
			for(int i=0;i<5;i++)table[i]=sc.next();
			int focus = 0;
			for(int i=1;i<5;i++)if(table[i].startsWith("*"))focus = i-1;
			for(int i=0;i<4;i++)for(int j=i+1;j<4;j++){
				String sub = table[i+1].substring(6+5*j, 9+5*j);
				String[] s = sub.split("-");
				if(s[0].equals("_")){
					teams[i].nobattle = j;
					teams[j].nobattle = i;
				}
				else{
					int x = Integer.parseInt(s[0]), y = Integer.parseInt(s[1]);
					teams[i].get[j] = x; teams[i].lose[j] = y;
					teams[j].get[i] = y; teams[j].lose[i] = x;
				}
			}
			double res = 0;
			for(int a=0;a<9;a++)for(int b=0;b<9;b++)for(int c=0;c<9;c++)for(int d=0;d<9;d++){
				double p = gain[a]*gain[b]*gain[c]*gain[d];
				int[] e = new int[]{a,b,c,d};
				for(int i=0;i<4;i++){
					teams[i].get[teams[i].nobattle] = e[i];
					teams[i].lose[teams[i].nobattle] = e[teams[i].nobattle];
				}
				res += p*win(focus);
			}
			System.out.printf("%.7f\n", res);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}