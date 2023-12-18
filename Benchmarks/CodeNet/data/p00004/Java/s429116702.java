import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a, b, c, d, e, f;
		double x, y;
		boolean flg;
		while(sc.hasNext()){
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			d = sc.nextDouble();
			e = sc.nextDouble();
			f = sc.nextDouble();
			
			y = (d*c - a*f) / (b*d - a*e);
			if(d == 0){
				x = (c - e * y) / a;
			}else{
				x = (f - e*y) / d;
			}
			System.out.printf(dd(x) + " " + dd(y) + "\n");
		}
	}
	public static String dd(double a){
		
		String s = String.format("%.3f", a);
		return Double.toString(Double.parseDouble(s) + 0.0);
	}
	/*
		if(s.charAt(0) == '-'){
			boolean flg = false;
			for(int i = 1; i < s.length(); i++){
				if(s.charAt(i) != '0' && s.charAt(i) != '.'){
					flg = true;
				}
			}
	*/
	
}