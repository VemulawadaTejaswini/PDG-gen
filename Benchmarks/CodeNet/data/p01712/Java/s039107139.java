import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	
	class WifiSpot{
		int x;
		int y;
		int w;
	}
	
	
	WifiSpot WifiSpotLoader(){
		WifiSpot s = new WifiSpot();
		s.x = sc.nextInt();
		s.y = sc.nextInt();
		s.w = sc.nextInt();
		return  s;
	}
	
	void padding(int[] x, int[]y , WifiSpot w){
		int sx = Math.max(w.x - w.w, 0);
		int ex = Math.min(w.x + w.w, x.length-1);
		
		IntStream.rangeClosed(sx, ex).forEach(a->x[a]++);

		int sy = Math.max(w.y - w.w, 0);
		int ey = Math.min(w.y + w.w, y.length-1);
		
		IntStream.rangeClosed(sy, ey).forEach(a->y[a]++);

	}
	

	Scanner sc;
	void run(){
			
		sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		
		List<WifiSpot> l = IntStream.range(0,n)
				.mapToObj(a->WifiSpotLoader())
				.collect(Collectors.toList());
		
		
		int[] x = new int[w+1];
		int[] y = new int[h+1];
		
		l.stream().forEach(ws->padding(x,y,ws));
		boolean xok = Arrays.stream(x).allMatch( a -> a>0 );
		boolean yok = Arrays.stream(y).allMatch( a -> a>0 );
		
		if(xok || yok){
			System.out.println("Yes");
		}else{
			System.out.println("No");			
		}
		
		return;
	}
	
	
	public static void main(String [] args){
		Main m = new Main();
		m.run();
	}
}