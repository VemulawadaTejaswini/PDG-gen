import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

  class Calcurator {
	 static double p = 3.141592653589;
	public static double circle(int r){
		double cir = 2*p*r;
		return cir;
	}
	public static double area(int r){
		double area = p*r*r;
		return area;
	}
	public static boolean exception(int r){
		boolean result;
		if(0 < r && r < 10000){
			result = true;
		}
		else{
			result = false;
		}
		return result;
	}
	public static void main(String[] args) throws IOException{
		/**
		 * ?????°?????£?¨?
		 */
		int r = 0;
		/**
		 * ?????????????????\?????¨int??????
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		r = Integer.parseInt(br.readLine());
		/**
		 * ????????¨????????????
		 */
		if(exception(r) == true){
		System.out.printf("%f ",area(r));
		System.out.printf("%f\n",circle(r));
		}
	}

}