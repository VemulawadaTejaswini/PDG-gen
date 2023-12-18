import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();		//動物の総数
		int y=sc.nextInt();		//足の総数
				
		if(y%2==1||x*4<y||x*2>y) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		sc.close();
	}

}
