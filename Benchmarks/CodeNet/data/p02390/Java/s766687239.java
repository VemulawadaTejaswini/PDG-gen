public class Main {
	public static void main(String[] args){
		int S = new java.util.Scanner( System.in).nextInt(0 <= S <86400);
		int h,m,s;
		h = S/3600;
		m = (S%3600)/60;
		s = (S%3600)%60;
		System.out.print(h + ":" + m + ":" +s);
	}

}