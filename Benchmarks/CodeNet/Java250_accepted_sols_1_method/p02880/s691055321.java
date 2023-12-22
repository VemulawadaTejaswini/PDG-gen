import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		ArrayList<Integer>Array= new ArrayList<Integer>();
		
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
			Array.add(i*j);
			}
		}
		
		if(Array.contains(n)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}