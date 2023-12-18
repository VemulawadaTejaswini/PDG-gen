import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Double> x = new ArrayList<Double>();
	static ArrayList<Double> y = new ArrayList<Double>();
	
	public static void main(String[] args) {
		read();
		solve();
	}
	
	static void read(){
		while(sc.hasNext()){
			String[] in = sc.next().split(",");
			x.add(Double.parseDouble(in[0]));
			y.add(Double.parseDouble(in[1]));
		}
	}
	
	static void solve(){
		int n = x.size();
		double px = 0, py = 0;
		for(int i = 0; i < x.size() && i < y.size(); i++){
			px += x.get(i);
			py += y.get(i);
		}
		px = px/n; py = py/n;
		ArrayList<Double> tri = new ArrayList<Double>();
		for(int i = 0; i < x.size()-1 && i < y.size()-1; i++){
			double a = Math.hypot(px-x.get(i), py-y.get(i));
			double b = Math.hypot(px-x.get(i+1), py-y.get(i+1));
			double c = Math.hypot(x.get(i+1)-x.get(i), y.get(i+1)-y.get(i));
			double z = (a+b+c)/2;
			tri.add(Math.sqrt(z*(z-a)*(z-b)*(z-c)));
		}
		double a = Math.hypot(px-x.get(0), py-y.get(0));
		double b = Math.hypot(px-x.get(x.size()-1), py-y.get(y.size()-1));
		double c = Math.hypot(x.get(x.size()-1)-x.get(0), y.get(y.size()-1)-y.get(0));
		double z = (a+b+c)/2;
		tri.add(Math.sqrt(z*(z-a)*(z-b)*(z-c)));
		double res = 0;
		for(int i = 0; i < tri.size(); i++){
			res += tri.get(i);
		}
		System.out.println(res);
	}

}