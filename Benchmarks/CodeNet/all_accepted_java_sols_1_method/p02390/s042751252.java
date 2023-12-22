import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int s =sc.nextInt();//秒
		int h = s/3600;
		int m=(s%3600)/60;
		s=(s%3600)%60;
		System.out.println(h+":"+m+":"+s);
	}
		

}

