import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		int x=sc.nextInt();		//整数x
		int n=sc.nextInt();		//数字列の長さ

		ArrayList<Integer>array=new ArrayList<>();
		for(int i=0;i<n;i++) {
			array.add(sc.nextInt());
		}
		
		for(int i=0;i<100;i++) {
			if(!array.contains(x-i)) {
				System.out.println(x-i);
				break;
			}else if(!array.contains(x+i)) {
				System.out.println(x+i);
				break;
			}
			
		}
    }
}