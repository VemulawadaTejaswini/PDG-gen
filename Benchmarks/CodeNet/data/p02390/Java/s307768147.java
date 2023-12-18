import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h,m,ss,s;
		s=sc.nextInt();
		ss=(s%3600)%60;
		h=s/3600;
		m=(s%3600)/60;
		System.out.println(h+":"+m+":"+ss);
		sc.close();		
 }
}
