import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int intgoukei;
		int happy1000;
		int happy5;

		BigDecimal bigX=BigDecimal.valueOf(X);
		BigDecimal gohyaku=BigDecimal.valueOf(500);
		BigDecimal bigresult=bigX.divide(gohyaku,0,RoundingMode.DOWN);

		int bigresult1=bigresult.intValue();

		int senresult=bigresult1*500;
		

		intgoukei=X-senresult;
		BigDecimal goukei=BigDecimal.valueOf(intgoukei);
			
		BigDecimal goen=BigDecimal.valueOf(5);
		BigDecimal goenresult=goukei.divide(goen,0,RoundingMode.DOWN);
		int goenresult1=goenresult.intValue();
		int goenresult2=goenresult1*5;
		
		int amari=X-(senresult+goenresult2);
		
		
		happy1000=bigresult1*1000;
		happy5=goenresult1*5;
		int happyX=happy1000+happy5;
		System.out.println(happyX);

	}

}
