import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			int n=in.nextInt();
			if(n==0)break;
			String name[]= new String[n];
			int P[]=new int[n];//種の値段
			int S[]=new int[n];//実の値段
			int M[]=new int[n];//何回実がなるか
			int F[]=new int[n];//累計何個実が出来るか
			plants pp[] = new plants[n];
			Name nn[] = new Name[n];
			for(int i=0;i<n;i++){
				int mim = 0;
				int time=0;
				name[i]=in.next();
				P[i]=in.nextInt();
				time+=in.nextInt();//A
				time+=in.nextInt();//B
				time+=in.nextInt();//C
				mim+=in.nextInt();//D
				mim+=in.nextInt();//Eこれらは
				F[i]=in.nextInt();
				S[i]=in.nextInt();
				M[i]=in.nextInt();
				for(int s=0;s<M[i];s++){
					time+=mim;
				}
				double c = 1.000*((F[i]*S[i]*M[i])-P[i])/time;
				nn[i] = new Name(name[i],c);
			}
			Arrays.sort(nn);
			for(int i=0;i<n;i++){
				pp[i] = new plants(nn[i].name,nn[i].cost);//名前順にソートしなきゃいけない。
			}
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
			/*
			 if(this.cost==o.cost){
				 return 0;
			 }else if(this.cost>o.cost){
				 return -1;
			 }else{
				 return 1;
			 }*/
		}
	}
	static class Name implements Comparable<Name>{
		String name;
		double cost;
		Name(String name,double cost){
			this.name=name;
			this.cost=cost;
		}
		public int compareTo(Name o) {
			return this.name.compareTo(o.name);
		}
		
	}
}