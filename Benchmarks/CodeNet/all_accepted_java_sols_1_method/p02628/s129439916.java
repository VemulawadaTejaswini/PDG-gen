import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();		//果物の種類
		int k=sc.nextInt();		//k種類の果物を一個ずつ買う
		
		ArrayList<Integer>p=new ArrayList<>();
		for(int i=0;i<n;i++) {
		p.add(sc.nextInt());		//1個当たりの金額
		}
		
		Collections.sort(p);	//ソート
		
		int count=0;
		for(int i=0;i<k;i++) {
			count+=p.get(i);
		}
		System.out.println(count);
		sc.close();
	}
}