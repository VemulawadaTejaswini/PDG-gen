import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

	final double EPS=1e-7;
	Scanner sc;
	
	class Pair{
		public int first;
		public double second;
		public Pair(int a,double b){
			first=a;
			second=b;
		}
		public String toString(){
			return first+" "+second;
		}
	}
	
	class PairComparator implements Comparator<Pair>{

		//第一要素で比較する⇒true
		private boolean first;
		PairComparator(boolean first){
			this.first=first;
		}

		@Override
		public int compare(Pair o1, Pair o2) {
			// TODO Auto-generated method stub
			if(first){
				return o1.first-o2.first;
			}
			else{
				double d1=o1.second,d2=o2.second;
				if(Math.abs(d1-d2)<EPS) return 0;
				else if(d1<d2) return -1;
				else return 1;
			}
		}
	}
	
	int ni(){
		return sc.nextInt();
	}
	double nd(){
		return sc.nextDouble();
	}

	void io(){
		sc=new Scanner(System.in);
		Pair[][] group;
		group=new Pair[3][8];
		
		for(int i=0;i<3;++i){
			for(int j=0;j<8;++j){
				group[i][j]=new Pair(ni(),nd());
			}
		}
		
		Pair[] loser=new Pair[18];
		int j=0;
		
		for(Pair[] g:group){
			Arrays.sort(g,new PairComparator(false));
			for(int i=0;i<2;++i){
				System.out.println(g[i]);
			}
			for(int i=2;i<8;++i)loser[j++]=g[i];
		}
		Arrays.sort(loser,new PairComparator(false));
		for(int i=0;i<2;++i)System.out.println(loser[i]);
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}