import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i=1;
		int x;
		Scanner sc = new Scanner(System.in);
		while(true){
			x = sc.nextInt();
			if(x==0){
				break;
			}
			System.out.println("Case " + i + ": " + x);
			i++;
		}

	}

}