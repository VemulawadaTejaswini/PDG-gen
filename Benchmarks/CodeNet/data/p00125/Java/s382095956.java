import java.util.*;
import java.math.*;

public class Main{
	private static boolean isLeap(int y){
		return y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
	}

	private static BigInteger toDay(int y,int m,int d){
		BigInteger res = new BigInteger(Integer.toString(d));

		res = res.add(new BigInteger(Integer.toString((y-1) * 365)));
		for(int i=4;i<y;i++){
			if(isLeap(i)){
				res = res.add(BigInteger.ONE);
			}
		}

		for(int i=1;i<m;i++){
			switch(i){
			case 2:
				if(isLeap(y)) res = res.add(new BigInteger("29"));
				else res = res.add(new BigInteger("28"));
				break;
			case 4:
			case 6:
			case 9:
			case 12:
				res = res.add(new BigInteger("30"));
				break;
			default:
				res = res.add(new BigInteger("31"));
				break;
			}
		}
		return res;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int y1= sc.nextInt();
			int m1= sc.nextInt();
			int d1= sc.nextInt();
			int y2= sc.nextInt();
			int m2= sc.nextInt();
			int d2= sc.nextInt();
			if(y1 == -1) break;
			System.out.println(toDay(y2,m2,d2).subtract(toDay(y1,m1,d1)));
		}
	}
}