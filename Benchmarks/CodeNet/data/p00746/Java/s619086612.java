import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		Main app = new Main();
		String str[];
		
		int n, x1, x2, y1, y2;
		while(true){
			if((n = Integer.valueOf(reader.readLine())) == 0) break;
			x1 = x2 = 0;
			y1 = y2 = 0;
			
			HashMap<Integer, Pair> map = new HashMap<Integer, Pair>();
			map.put(0, new Pair(0, 0));
			for(int i = 1; i < n; i++){
				str = reader.readLine().split(" ");
				map.put(i, app.flag(Integer.valueOf(str[1]), map.get(Integer.valueOf(str[0]))));
				Pair p = map.get(i);
				if(x1 < p.x) x1 = p.x;
				if(x2 > p.x) x2 = p.x;
				if(y1 < p.y) y1 = p.y;
				if(y2 > p.y) y2 = p.y;
			}
			System.out.println((x1 - x2 + 1) + " " + (y1 - y2 + 1));
		}
		reader.close();
	}
	public Pair flag(int n, Pair p){
		switch(n){
		case 0 : return new Pair(p.x - 1, p.y);
		case 1 : return new Pair(p.x, p.y - 1);
		case 2 : return new Pair(p.x + 1, p.y);
		case 3 : return new Pair(p.x, p.y + 1);
		}
		return null;
	}
}

class Pair{
	int x;
	int y;
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}