import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int kokugo = sc.nextInt();
		int math = sc.nextInt();
		int kp = sc.nextInt();
		int mp = sc.nextInt();
		double result;
		
		double kdays = (double)kokugo/(double)kp;
		double mdays = (double)math/(double)mp;
		
		if(kdays>mdays){
			result = days - kdays;
		}else{
			result = days - mdays;
		}

		System.out.println((int)result);

	}

}