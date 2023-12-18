import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			String str = cin.next();
			String[] s = str.split(",");
			int num = Integer.parseInt(s[0]);
			double w = Double.parseDouble(s[1]);
			double t = Double.parseDouble(s[2]);
			if(w/(t*t) >= 25.0){
				System.out.println(num);
			}
		}

	}

}