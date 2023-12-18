import java.util.Scanner;
import java.util.Arrays;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String[] str = (sc.nextLine()).split(" ");
			double n = Double.parseDouble(str[0]), t;
			double[] rk = new double[str.length-1];
			double[] rk2 = new double[str.length];
			
			for(int i = 1; i < str.length; i++){
				rk[i-1] = Double.parseDouble(str[i]);
			}
			
			Arrays.sort(rk);
			boolean f = false;
			for(int i=0, j=rk.length-1; i <= j; i++, j--){
				rk2[2*i] = rk[i];
				rk2[2*i+1] = rk[j];
			}
			t = rk2[0]+rk2[rk.length-1];
			for(int i = 0; i < rk.length-1; i++){
				t += func(rk2[i], rk2[i+1]);
			}

			if(t <= n){
				f = true;
			}
			
			for(int i=0, j=rk.length-1; i <= j && !f; i++, j--){
				rk2[2*i] = rk[j];
				rk2[2*i+1] = rk[i];
			}
			t = rk2[0]+rk2	[rk.length-1];
			for(int i = 0; i < rk.length-1 && !f; i++){
				t += func(rk2[i], rk2[i+1]);
			}
			if(t <= n && !f){
				f = true;
			}
			
			if(f){
				System.out.println("OK");
			} else {
				System.out.println("NA");
			}
		}
	}
	
	double func(double s, double t){
		double u = s+t, v;
		if(s == t){
			return u;
		}
		if(s > t){
			v = s - t;
		} else {
			v = t - s;
		}
		
		return Math.sqrt(u*u-v*v);
	}
	
	public static void main(String[] args){
		new Main();
	}
}