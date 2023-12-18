import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a,b,i;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			a = sc.nextInt();
			b = sc.nextInt();
			a = a + b;
			for(i = 0;a > 0;i++){
				a = a / 10;
				
			}
			System.out.println(i);
		}
	}