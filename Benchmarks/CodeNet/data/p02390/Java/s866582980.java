import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int S,h,m,s;
		S = sc.nextInt();
		h = S/3600;
		m = (S-h*3600)/60;
		s = S-h*3600-m*60;
		System.out.println(h+":"+m+":"+s);
	}
}