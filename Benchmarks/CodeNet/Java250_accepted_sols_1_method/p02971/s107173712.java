import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		

		int n=sc.nextInt();		//数字列
		int a[]=new int[n];
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			a[i]= sc.nextInt();
			list.add(a[i]);
		}
		//昇順に並び替える
		Collections.sort(list);
		
		for(int i=0; i<n; i++) {
			if(a[i]==list.get(n-1)) {
				System.out.println(list.get(n-2));
			}else {
				System.out.println(list.get(n-1));
			}
		}
		sc.close();
	}
}