import java.util.*;
class Main {
	public static void main(String...args) {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
	    int minValue = scan.nextInt();
		int nowValue = scan.nextInt();
		int dif = nowValue - minValue;
		minValue = Math.min(nowValue,minValue);
		
		for(int i =0; i < times -2; i ++) {
			nowValue = scan.nextInt();
			dif = Math.max(nowValue - minValue , dif);
			minValue = Math.min(nowValue,minValue);
		}
		System.out.println(dif);
	}
}
