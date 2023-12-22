import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int t = 0;
		int h = 0;
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			String taro = scan.next();
			String hana = scan.next();
			if(taro.compareTo(hana) > 0){
				t += 3;
			} else if(taro.compareTo(hana) < 0){
				h += 3;
			} else {
				t++;
				h++;
			}
		}
		System.out.printf("%d %d\n", t, h);
	}
}