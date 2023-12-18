
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Pyramid> pyramid = new ArrayList<Pyramid>();
		while(true){
			int x = Integer.parseInt(br.readLine());
			int h = Integer.parseInt(br.readLine());
			if(x == 0 && h == 0){
				break;
			}
			pyramid.add(new Pyramid(x, h));
		}
		for(Pyramid p : pyramid){
			System.out.printf("%.6f\n", p.getSurfaceArea());
		}
	}
}

class Pyramid{
	int x;
	int h;
	Pyramid(int x, int h){
		this.x = x;
		this.h = h;
	}
	public double getSurfaceArea(){
		double squareArea = x * x;
		return squareArea + (double)x * (Math.sqrt((squareArea + (double)(4 * h * h))));
	}
}