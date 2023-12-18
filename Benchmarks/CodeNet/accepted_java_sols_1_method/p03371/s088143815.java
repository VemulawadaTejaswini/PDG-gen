
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();

		int nedan=a*x+b*y;
		int z=0;

		while(nedan>a*(x-1)+b*(y-1)+c*(z+2)) {
			nedan=a*(x-1)+b*(y-1)+c*(z+2);
			x--;
			y--;
			z+=2;

			if(x==0)
				x++;
			if(y==0)
				y++;
		}

		System.out.print(nedan);
	}

}
