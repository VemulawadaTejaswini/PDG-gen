import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String s = scan.next();
		
		String[] data = s.split("");
		
		if(a >= data.length ) {
			System.out.println(s);
		}
		if(a < data.length){
			for(int i = 0; i < a; i++) {
				System.out.print(data[i]);
			}
			System.out.print("...");
		}
		
		

}
}
