import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x,y;
		Scanner sc = new Scanner(System.in);
		while(true){
			x = sc.nextInt();
			y = sc.nextInt();
			if(x==0&&y==0){
				break;
			}
			else if(x <= y){
				System.out.println(x + " " + y);
			}
			else{
				System.out.println(y + " " + x);
			}
		}

	}

}