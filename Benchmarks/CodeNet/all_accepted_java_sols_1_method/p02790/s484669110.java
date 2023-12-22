import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = 0;
		int m = 0;
		for(int x=0;b>x;x++){
			int v= (int)Math.pow(10, x);
			n=n+a*v;
		}
		for(int y=0;a>y;y++){
			int z=(int)Math.pow(10, y);
			m=m+b*z;
		}

		if(Integer.compare(n, m)==-1){
			System.out.println(m);
		}else{
			System.out.println(n);
		}
	}

}
