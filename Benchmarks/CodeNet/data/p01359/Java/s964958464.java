import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;

			Year[] y = new Year[n];
			for(int i=0;i<n;i++){
				y[i] = new Year(sc.next(),sc.nextInt(),sc.nextInt());
			}
			Arrays.sort(y);

			for(int i=0;i<m;i++){
				int q = sc.nextInt();
				int j;
				for(j=0;j<n && y[j].y<q;j++);

				int ans = 0;
				if(j >= n || (ans=y[j].y-q) >= y[j].b){
					System.out.println("Unknown");
					continue;
				}
				System.out.println(y[j].name + " " + (y[j].b - ans));
			}
		}
	}
}

class Year implements Comparable<Year>{
	String name;
	int b,y;

	Year(String name,int b,int y){
		this.name = name;
		this.b = b;
		this.y = y;
	}

	public int compareTo(Year year){
		return y - year.y;
	}
}