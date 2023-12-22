import java.util.Scanner;
public class Main{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int time=sc.nextInt();

		int h=time/3600;
		int m=(time-h*3600)/60;
		int s=time%60;
		
		sc.close();
		
		System.out.println(h+":"+m+":"+s);
	}

}