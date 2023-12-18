import java. util.Scanner; 

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h,m,s;
		int S = sc.nextInt();
		 h = S/3600;    		
		 m = S/60;
		 S = S%3600;
		 m= S/60;
		 S= S%60;
		System.out.println(h+":"+m+":"+S);
		
	
		
	}
}