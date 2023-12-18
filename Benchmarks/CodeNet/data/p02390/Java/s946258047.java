import java.util.*;
class Main{
	Scanner sc=new Scanner(System.in);
	void aa(){
		int S=sc.nextInt();
		int h=S/3600;
		int m=(S%3600)/60;
		int s=S%60;
		System.out.println(h+":"+m+":"+s);
	}
	public static void main(String[]arg){
		new Main().aa();
	}
}