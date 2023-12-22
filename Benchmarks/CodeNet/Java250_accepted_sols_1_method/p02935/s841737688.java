import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		ArrayList<Integer>v=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			v.add(sc.nextInt());
		}
		Collections.sort(v);
		double ans=v.get(0);
		
		for(int i=0;i<n;i++) {
			ans=(ans+v.get(i))/2;
		}
		
		System.out.println(ans);

	}

}