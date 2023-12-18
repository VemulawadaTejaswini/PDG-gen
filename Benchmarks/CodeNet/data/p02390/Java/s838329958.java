import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdn = new Scanner(System.in);
		int h = 0;
		int m = 0;
		int s2 = 0;
		int S = 0;
		S = stdn.nextInt();
		
		h = S/3600;
		m = (S-(h*3600))/60;
		s2= (S-(h*3600))-(m * 60); 
		System.out.println(h + ":" + m + ":" +s2);
	}
}