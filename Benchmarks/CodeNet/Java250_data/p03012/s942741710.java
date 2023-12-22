import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();		//n個の重り
		ArrayList<Integer>w=new ArrayList<Integer>();
		
		int sum=0;
		for(int i=0;i<n;i++) {
			w.add(sc.nextInt());	//重りの重さ
			sum+=w.get(i);
		}
		int s1=w.get(0);
		int s2=sum-w.get(0);
		int ans=Math.abs(s1-s2);
		
		for(int i=1;i<n-1;i++) {
			s1+=w.get(i);
			s2-=w.get(i);
			ans=Math.min(ans,Math.abs(s1-s2));
		}
		System.out.println(ans);
		sc.close();
	}
}