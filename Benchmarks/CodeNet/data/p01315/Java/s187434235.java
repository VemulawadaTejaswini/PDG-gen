import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			int n=in.nextInt();
			if(n==0)break;
			String name[]= new String[n];
			plants pp[] = new plants[n];
			for(int i=0;i<n;i++){
				int mim = 0;
				int time=0;
				name[i]=in.next();
				int P=in.nextInt();
				time+=in.nextInt();//A
				time+=in.nextInt();//B
				time+=in.nextInt();//C
				mim+=in.nextInt();//D
				mim+=in.nextInt();//Eこれらは
				int F=in.nextInt();
				int S=in.nextInt();
				int M=in.nextInt();
				for(int s=0;s<M;s++){
					time+=mim;
				}
				double c = 1.000*((F*S*M)-P)/time;
				pp[i]=new plants(name[i],c);
			}
			Arrays.sort(pp,new ss());
			Arrays.sort(pp);
			for(int i=0;i<n;i++){
				System.out.println(pp[i].name);
			}
			System.out.println("#");
		}
	}
	static class plants implements Comparable<plants>{
		String name;
		double cost;
		plants(String name,double cost){
			this.name=name;
			this.cost=cost;
		}
		public int compareTo(plants o) {
			return Double.compare(o.cost,this.cost);//降順
		}
	}
	
	static class ss implements Comparator{
		public int compare(Object o1, Object o2) {
			return ((plants)o1).name.compareTo(((plants)o2).name);
		}
	}
}