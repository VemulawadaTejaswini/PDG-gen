
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int x = sc.nextInt();
			//System.out.println(x);
			if(x == 0) {
		//		System.out.println("???????????????");
				break;
			}
			String strX = String.valueOf(x);
			String strA ="";
			int intSum = 0;
			for(int i = 0; i < strX.length(); i++) {
				strA = strX.substring(i,i+1);
				intSum += Integer.parseInt(strA);
			}
			System.out.println(intSum);
		}
	}
}