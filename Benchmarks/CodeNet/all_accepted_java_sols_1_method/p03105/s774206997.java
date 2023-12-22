import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();	//音1回
		int b = sc.nextInt();	//所持金
		int c = sc.nextInt();	//満足

		int d = c*a;		//満足の必要金額

		int e = b/d;		//満足回数
		int f = e*c;		//聴回数

		if(e<1){
			f = b/a;
		}		

		System.out.println(f);
	}
}