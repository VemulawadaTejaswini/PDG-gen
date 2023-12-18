import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		Bridge[] b = new Bridge[n];
		for(int i = 0; i < n; i++){
			String in = sc.next();
			int x = Integer.parseInt(in.substring(0, in.indexOf(",")));
			int y = Integer.parseInt(in.substring(in.indexOf(",") + 1,
					in.length()));
			b[i] = new Bridge(x, y);
		}
		Lot l = new Lot(b);
		
		int[] result = new int[w];
		for(int i = 1; i <= w; i++){
			result[l.lot(i) - 1] = i;
		}
		for(int i = 0; i < result.length; i++)
			System.out.println(result[i]);
		sc.close();
	}
	
}

class Bridge{
	
	int x;
	int y;
	
	Bridge(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Lot{
	
	Bridge[] bridges;
	
	Lot(Bridge... b){
		this.bridges = b;
	}
	
	int lot(int num){
		int result = num;
		for(Bridge b: this.bridges){
			if(result == b.x)
				result = b.y;
			else if(result == b.y) result = b.x;
		}
		return result;
	}
	
}