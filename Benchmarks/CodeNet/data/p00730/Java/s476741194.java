
import java.util.*;
public class Main {
	
	//0400 start
	
	class C{
		int w,h;

		public C(int w, int h) {
			this.w = w;
			this.h = h;
		}

		@Override
		public String toString() {
			return "C [w=" + w + ", h=" + h + "]";
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int w = sc.nextInt();
			int h = sc.nextInt();
			if((n|w|h) == 0) break;
			ArrayList<C> list = new ArrayList<Main.C>();
			list.add(new C(w, h));
			for(int i = 0; i < n; i++){
				//System.out.println(list.toString());
				int p = sc.nextInt() - 1;
				int s = sc.nextInt();
				C now = list.get(p);
				list.remove(p);
				s = s % (now.w + now.h);
				int j = 0;
				for(j = 0 ; j < 5; j++){
					int ninus = j % 2 == 0 ? now.w : now.h;
					if(s - ninus < 0){
						break;
					}
					s = s - ninus;
				}
				if(j % 2 == 0){
					C next1 = new C(s, now.h);
					C next2 = new C(now.w - s, now.h);
					if(next1.h * next1.w < next2.h * next2.w){
						list.add(next1); list.add(next2);
					}
					else{
						list.add(next2); list.add(next1);
					}
				}
				else{
					C next1 = new C(now.w, s);
					C next2 = new C(now.w, now.h - s);
					if(next1.h * next1.w < next2.h * next2.w){
						list.add(next1); list.add(next2);
					}
					else{
						list.add(next2); list.add(next1);
					}
				}
			}
			ArrayList<Integer> res = new ArrayList<Integer>();
			for(int i = 0; i < list.size(); i++){
				res.add(list.get(i).h * list.get(i).w);
			}
			Collections.sort(res);
			System.out.print(res.get(0));
			for(int i = 1; i < res.size(); i++){
				System.out.print(" " + res.get(i));
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}