import java.util.Scanner;
public class Main {
	void watch(){
		int h,m,s;
		Scanner s1 = new Scanner(System.in);
		s = s1.nextInt();
		h = s/3600;
		s-=h*3600;
		m = s/60;
		s-=m*60;
		System.out.println(h + ":" + m + ":" + s);
	}
	public static void main(String args[]){
		Main m1 = new Main();
		m1.watch();
	}
}