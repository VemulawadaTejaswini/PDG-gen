import java.util.Scanner;
class AOJ_GS4{
	public static void main(String[]agrs){
    Scanner sc = new Scanner(System.in);
	int S;
	int h,m,s;
	
	S = sc.nextInt();
	h=S/3600;
	m=S%3600/60;
	s=S%60;
	System.out.println(h+":"+m+":"+s);
	
	}
}