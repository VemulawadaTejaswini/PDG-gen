
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


			while(sc.hasNext()) {
				String x = sc.nextLine();
				int intX = Integer.parseInt(x);
				//System.out.println(x);
				if(intX == 0) {
			//		System.out.println("???????????????");
					break;
				}
				String strX = String.valueOf(x);
				String strA ="";
				int Sum = 0;
				for(int i = 0; i < strX.length(); i++) {
					strA = strX.substring(i,i+1);
					Sum += Integer.parseInt(strA);
				}
				System.out.println(Sum);
			}

	}
}