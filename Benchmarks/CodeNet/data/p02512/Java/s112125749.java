import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			Hashi[] h = new Hashi[n];
			for(int i=0;i<n;i++){
				h[i] = new Hashi(sc.nextInt(),sc.nextInt());
			}
			Arrays.sort(h);

			int sum = 0;
			boolean flg = true;
			for(int i=0;i<n;i++){
				sum += h[i].y;
				if(sum > h[i].x){flg = false; break;}
			}

			if(flg) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}

class Hashi implements Comparable<Hashi>{
	int x,y;

	public Hashi(int y,int x){
		this.x = x;
		this.y = y;
	}

	public int compareTo(Hashi h){
		return this.x - h.x;
	}
}