import java.util.ArrayList;
import java.util.Scanner;

class Vec {
	double x,y;
	Vec(double x, double y) {
		this.x = x;
		this.y = y;
	}
	Vec add(Vec b) {
		return new Vec(this.x + b.x, this.y + b.y);
	}
	Vec sub(Vec b) {
		return new Vec(this.x - b.x, this.y - b.y);
	}
	Vec mul(double k) {
		return new Vec(this.x * k, this.y * k);
	}
	double abs() {
		return  Math.sqrt(this.x * this.x + this.y * this.y);
	}
	double dot(Vec b) {
		return  this.x * b.x + this.y * b.y;
	}
	double cross(Vec b) {
		return  this.x * b.y - this.y * b.x;
	}
}

/**
0.0,0.0
0.0,1.0 
1.0,1.0 
2.0,0.0 
1.0,-1.0 

**/
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Vec> a = new ArrayList<>();
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			if(line.equals("")) {
				break;
			}
			String[] t = line.split(",");
			double x = Double.parseDouble(t[0]);
			double y = Double.parseDouble(t[1]);
			a.add(new Vec(x, y));
		}
		double area = 0.0;
		for(int i = 2; i < a.size(); i++) {
			Vec p = a.get(i-1).sub(a.get(0));
			Vec q = a.get(i).sub(a.get(0));
			area += Math.abs(p.cross(q)) / 2.0;
		}
		System.out.printf("%.6f\n", area);
		sc.close();
	}
}
