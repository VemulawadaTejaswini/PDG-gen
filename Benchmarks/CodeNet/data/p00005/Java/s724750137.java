import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	Scanner sc = new Scanner(System.in);
	
	long a,b,x,y,GCD,LCM;
	
	a = sc.nextLong();
	b = sc.nextLong();
	
	x=a;
	y=b;
	
	GCD = a%b;
	
	while(!(GCD == 0)){
		a = y;
		b = GCD;
		GCD = a%b;
	}
	
	GCD = b;
	
	LCM = (x*y)/GCD;
	
	System.out.println(GCD+ " " +LCM);
	

	}

}