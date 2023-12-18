import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc= new Scanner(System.in);
		long a= sc.nextInt();
		long b= sc.nextInt();
		long c= sc.nextInt();
		long d= sc.nextInt();
		
		sc.close();
		
		long ans= a*c;
		
		if(a*d > ans)ans= a*d;
		
		if(b*c > ans)ans= b*c;
		if(b*d > ans)ans= b*d;
		
		System.out.println(ans);
		
		
	}

}
