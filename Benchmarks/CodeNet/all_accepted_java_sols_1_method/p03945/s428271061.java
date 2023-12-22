import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int countA = 0;
		int countB = 0;
		int a = 0;
		while(true){
			a = N.indexOf("BW",a)+1;
			if (a == 0)break;
			countA++;
		}
		while(true){
			a = N.indexOf("WB",a)+1;
			if (a == 0)break;
			countB++;
		}
		System.out.println(countA+countB);
	}
}
