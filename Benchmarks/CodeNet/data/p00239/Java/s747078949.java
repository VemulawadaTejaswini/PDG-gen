import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0239();
	}

	class AOJ0239{
		public AOJ0239() {
			while(true){
				int n = in.nextInt();
				if(n==0)break;
				ArrayList<Sweet> list = new ArrayList<Sweet>();
				for(int i=0;i<n;i++)list.add(new Sweet(in.nextInt(),in.nextInt(), in.nextInt(), in.nextInt()));
				int P = in.nextInt(),Q = in.nextInt(),R = in.nextInt(),C = in.nextInt();
				boolean sw=false;
				for(int i=0;i<list.size();i++){
					if(list.get(i).p<=P&&list.get(i).q<=Q&&list.get(i).r<=R&&list.get(i).sum<=C){
						System.out.println(list.get(i).num);
						sw=true;
					}
				}
				if(sw==false)System.out.println("NA");
			}
		}
		class Sweet{
			int num,sum,p,q,r;
			public Sweet(int num,int p,int q,int r) {
				this.num = num;this.sum=p+q+r;this.p = p;this.q = q;this.r = r;
			}
		}
	}

}