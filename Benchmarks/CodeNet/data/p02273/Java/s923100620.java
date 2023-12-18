//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main<T> {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//System.setIn(new FileInputStream("./input.txt"));
		Reader r = new InputStreamReader(System.in);
		int n = r.read() - 0x30;
		//n = 6;
		//long start = System.nanoTime();
		
		Point[] p = Koch(n);
		//System.out.println((start - System.nanoTime())/ 1000 + " us");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < p.length; ++i){
			sb.append(p[i] + "\n");
		}
		System.out.println(sb);
	}

	public static Point[] Koch(int n) {
		Point[] p, p2;
		if(n == 0){
			p = new Point[2];
			p[0] = new Point(0.0f, 0.0f);
			p[1] = new Point(100.0f, 0.0f);
			return p;
		}else{
			p = Koch(n-1);
			p2 = new Point[(p.length - 1)*4 + 1];
			for(int i = 0; i < p.length; ++i) {
				// left edge
				p2[i*4] = new Point(p[i].x, p[i].y);
				if(i == p.length - 1){
					break;
				}
				// 3 middle points
				float mx = (p[i+1].x - p[i].x);
				float my = (p[i+1].y - p[i].y);
				
				p2[i*4 + 1] = new Point(mx / 3.0f + p[i].x, my / 3.0f + p[i].y);
				p2[i*4 + 2] = new Point(mx / 2.0f - my / (2.0f * 1.7320508f) + p[i].x,
						my / 2.0f + mx / (2.0f * 1.7320508f) + p[i].y);
				p2[i*4 + 3] = new Point(mx * 2.0f / 3.0f + p[i].x, my * 2.0f / 3.0f + p[i].y);
			}
			return p2;
		}
	}

	
}
class Point {
	public float x;
	public float y;
	@Override
	public String toString(){
		return String.format("%.5f %.5f", x, y);
	}
	public Point(float x, float y){
		this.x = x;
		this.y = y;
	}
}