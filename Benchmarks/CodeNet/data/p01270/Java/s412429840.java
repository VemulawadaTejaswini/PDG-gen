import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

///Restrictive Filesystem
public class Main{

	class R implements Comparable<R>{
		int id, s, t;
		public R(int id, int s, int t) {
			this.id = id;
			this.s = s;
			this.t = t;
		}
		public int compareTo(R o) {
			return s-o.s;
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			List<R> l = new LinkedList<R>();
			l.add(new R(-1, 0, 1000000000));
			while(n--!=0){
//				Collections.sort(l);
				char cmd = sc.next().charAt(0);
				if(cmd=='R'){
					int p = sc.nextInt();
					for(R r:l){
						if(r.s<=p&&p<=r.t){
							System.out.println(r.id); break;
						}
					}
				}
				else if(cmd=='W'){
					int id = sc.nextInt(), len = sc.nextInt();
					for(int i=0;i<l.size();i++){
						R r = l.get(i);
						if(r.id!=-1)continue;
						int L = r.t-r.s+1;
						if(L<len){
							r.id = id;
							len-=L;
						}
						else{
							l.remove(i);
							l.add(i, new R(id, r.s, r.s+len-1));
							l.add(i+1, new R(r.id, r.s+len, r.t));
							break;
						}
					}
				}
				else{
					int id = sc.nextInt();
					for(int i=0;i<l.size();i++){
						R r = l.get(i);
						if(r.id!=id)continue;
						r.id = -1;
					}
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}