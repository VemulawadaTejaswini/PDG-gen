import java.util.Scanner;

public class Main {
	public static void main ( String[] args ) {
		long m , n , sum = 0 , ave = 0 , count = 0;
		Scanner sc = new Scanner(System.in);
		while ( sc.hasNextLine() ) {
			String str = sc.nextLine();
			String[] strAry = str.split(",");
			m = Integer.parseInt(strAry[0]);
			n = Integer.parseInt(strAry[1]);
			sum += m * n;
			count++;
		}
		ave = Math.round((float)( sum / count ));
		System.out.println(sum+"\n"+ave);
	}
}