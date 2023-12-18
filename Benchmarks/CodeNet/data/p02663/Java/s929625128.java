import java.util.*;

public class Main {

    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		int k = sc.nextInt();
		
		int h = getHoursToMinutes(h1, h2);
		int m = getMinutes(m1, m2);
	
		int mergin = (h + m) - k;
		// 出力
		System.out.println(mergin);
	}
	
	private static int getHoursToMinutes(int h1, int h2) {
	    return (h2 - h1) * 60;
	}
	
	private static int getMinutes(int m1, int m2) {
	    return m2 - m1;
	}
		
}