import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n==0) break;
			Plant[] pl = new Plant[n];
			for(int i=0; i<n; i++){
				pl[i] = new Plant(
						in.next()
						, in.nextInt()
						, in.nextInt()+in.nextInt()+in.nextInt()
						, in.nextInt()+in.nextInt()
						, in.nextInt()
						, in.nextInt()
						, in.nextInt());
			}
			Arrays.sort(pl);
			for(Plant p: pl) System.out.println(p.name);
			System.out.println("#");
		}
	}
}

class Plant implements Comparable<Plant>{
	double cost;
	String name;
	public Plant(String name, int p, int abc
			, int de, int f, int s, int m){
		double time = abc+de*m;
		double get = f*s*m-p;
		cost = get/time;
		this.name = name;
	}
	
	@Override
	public int compareTo(Plant o) {
		int res =  Double.compare(o.cost, cost);
		if(res != 0) return res;
		return name.compareTo(o.name);
	}
}