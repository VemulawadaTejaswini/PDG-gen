import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int N;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(;;){
			N=sc.nextInt();
			if(N==0)break;
			C[] c = new C[N];
			for(int i=0;i<N;i++){
				String name=sc.next();
				c[i]=new C(name);
				int m = sc.nextInt();
				for(int j=0;j<m;j++){
					c[i].time[sc.nextInt()]=1;
				}
			}
			for(int i=0;i<31;i++){
				int p = N+1;
				for(int j=0;j<N;j++){
					if(c[j].time[i]==1){
						p--;
					}
				}
				for(int j=0;j<N;j++){
					if(c[j].time[i]==1){
						c[j].point+=p;
					}
				}
			}
			Arrays.sort(c);
			int p = c[0].point;
			for(int i=0;i<N;i++){
				if(c[i].point==p){
//					System.out.println(c[i]);
				}
			}
			System.out.println(c[0]);
		}
	}
	static class C implements Comparable<C>{
		String name;
		int[] time;
		int point;
		
		C(String s){
			name=s;
			time=new int[31];
		}
		public int compareTo(C c){
			if(point==c.point){
				return name.compareTo(c.name);
			}
			return point-c.point;
		}
		public String toString(){
			return point +" " + name;
		}
	}
}