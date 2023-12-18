import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanNum = new Scanner(System.in);
	
	int S = scanNum.nextInt(); //??????
	int h,m,s;
	h = S / 3600;
	m = S / 60 % 60;
	s = S % 60;
	System.out.println(h + ":"+ m +":" + s);
	}
}