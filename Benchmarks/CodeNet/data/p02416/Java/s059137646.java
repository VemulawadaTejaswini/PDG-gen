
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


			while(sc.hasNext()) {
				String x = sc.nextLine();
				long intX = Long.parseLong(x);
				//System.out.println(x);
				if(intX == 0) {
			//		System.out.println("???????????????");
					break;
				}

				String strA ="";
				int Sum = 0;
				for(int i = 0; i < x.length(); i++) {
					strA = x.substring(i,i+1);
					Sum += Integer.parseInt(strA);
				}
				System.out.println(Sum);
			}

	}
}