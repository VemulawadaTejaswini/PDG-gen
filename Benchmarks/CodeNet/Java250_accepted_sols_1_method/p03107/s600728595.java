import java.util.*;

public class Main {
	
	static int result = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] strArray = s.split("");
		
		int zero = 0;
		int one = 0;
		for(int tmp = 0; tmp < strArray.length ; tmp++) {
			if(Integer.parseInt(strArray[tmp]) == 0) {
				one += 1;
			}else {
				zero += 1;
			}
		}
		System.out.println(strArray.length - Math.abs(zero - one));
	}
}