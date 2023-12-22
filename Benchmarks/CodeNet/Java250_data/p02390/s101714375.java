import java.util.Scanner;
class Main{
	
    Scanner sc = new Scanner(System.in);
	int S;
	int h,m,s;
	void goo(){
		S = sc.nextInt();
		h=S/3600;
		m=S%3600/60;
		s=S%60;
		System.out.println(h+":"+m+":"+s);
	}
	public static void main(String[]agrs){
		new Main().goo();
	}
}
	