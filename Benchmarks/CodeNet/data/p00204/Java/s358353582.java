import java.util.Scanner;

public class Main {
	static double[] ufo_x;
	static double[] ufo_y;
	static int[] ufo_rad;
	static int[] ufo_v;
	static boolean[] ufo_ex;
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
			int count = 0;
			int rad = sc.nextInt();
			int ufo = sc.nextInt();
			if(rad == 0 && ufo == 0) break;
			ufo_x = new double[ufo];
			ufo_y = new double[ufo];
			ufo_rad = new int[ufo];
			ufo_v = new int[ufo];
			ufo_ex = new boolean[ufo];
			for(int i = 0;i < ufo;i++){
				ufo_x[i] = sc.nextInt();
				ufo_y[i] = sc.nextInt();
				ufo_rad[i] = sc.nextInt();
				ufo_v[i] = sc.nextInt();
				ufo_ex[i] = true;
			}
			while(checkend(ufo_ex)){
				double min = 100000000;
				int num = 10000000;
				for(int i = 0;i < ufo;i++){
					double slp = slope(ufo_x[i],ufo_y[i]);
					if(ufo_x[i] > 0){
						ufo_x[i] -= ufo_v[i];
					}else if(ufo_x[i] < 0){
						ufo_x[i] += ufo_v[i];
					}
					ufo_y[i] = calc_y(slp,ufo_x[i]);
					double dis = distance(ufo_x[i],ufo_y[i]);
					if(dis <= rad && ufo_ex[i] == true){
						count++;
						ufo_ex[i] = false;
					}
					if(dis < min && ufo_ex[i] == true){
							min = dis;
							num = i;
					}
				}
				deleteufo(slope(ufo_x[num],ufo_y[num]));
			}
			System.out.println(count);
		}
	}
	
	public static boolean checkend(boolean[] b){
		for(int i = 0;i < b.length;i++){
			if(b[i]) return true;
		}
		return false;
	}
	
	public static void deleteufo(double slope){
		for(int i = 0;i < ufo_x.length;i++){
			if(slope(ufo_x[i],ufo_y[i]) == slope && ufo_ex[i] == true){
				ufo_ex[i] = false;
			}
		}
	}
	
	public static double calc_y(double slope,double x){
		return slope*x;
	}
	
	public static double distance(double x,double y){
		return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
	}
	
	public static double slope(double x,double y){
		return (y/x);
	}
	
}