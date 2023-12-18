import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int num=0,i,a,b,c;
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<num;i++){
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			if(a*a == ((b*b) + (c*c)) || b*b == ((a*a) + (c*c)) || c*c == ((a*a) + (b*b)))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}

}