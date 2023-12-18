import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			Vector2 a = new Vector2(sc.nextDouble(),sc.nextDouble());
			Vector2 b = new Vector2(sc.nextDouble(),sc.nextDouble());
			Vector2 c = new Vector2(sc.nextDouble(),sc.nextDouble());
			Vector2 d = new Vector2(sc.nextDouble(),sc.nextDouble());
			boolean parallel = Math.abs(a.subtract(b).cross(c.subtract(d))) < 1E-10;
			System.out.println(parallel ? "YES" : "NO");
		}
	}

}
class Vector2 {
	public double x;
	public double y;
	public Vector2(double x,double y) {
		this.x = x;
		this.y = y;
	}
	public double dot(Vector2 v) {
		return this.x*v.x+this.y*v.y;
	}
	public double cross(Vector2 v) {
		return this.x*v.y-this.y*v.x;
	}
	public double norm() {
		return Math.sqrt(this.x*this.x+this.y*this.y);
	}
	public Vector2 normalize() {
		return divide(norm());
	}
	public Vector2 add(Vector2 v) {
		return new Vector2(x+v.x,y+v.y);
	}
	public Vector2 subtract(Vector2 v) {
		return new Vector2(x-v.x,y-v.y);
	}
	public Vector2 multiply(double k) {
		return new Vector2(x*k,y*k);
	}
	public Vector2 divide(double k) {
		return new Vector2(x/k,y/k);
	}
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
}