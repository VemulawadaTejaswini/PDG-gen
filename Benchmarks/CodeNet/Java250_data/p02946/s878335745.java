import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		for(int i=y-(x-1);i<=y+x-1;i++) {
			if(i==y-(x-1))
			    System.out.print(i);
			else
				System.out.print(" "+i);
		}
	}

}