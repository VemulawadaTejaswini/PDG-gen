import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();		//数字列
		
		ArrayList<Integer>a= new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
		}
		ArrayList<Integer>b=new ArrayList<>(a);
		Collections.sort(b,Collections.reverseOrder());
		int max=Collections.max(b);
		
		for(int i=0;i<n;i++) {
			if(max==a.get(i)) {
				System.out.println(b.get(1));
			}else {
				System.out.println(max);
			}
		}
		sc.close();
	}
}
