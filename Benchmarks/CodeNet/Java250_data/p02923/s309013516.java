import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		ArrayList<Long>masu=new ArrayList<>(); 
		
		int a=0;
		int count=0;
		
		for(int i=0;i<n;i++) {
			masu.add(sc.nextLong());
		}
		
		
		for(int i=0;i<n-1;i++) {
			if(masu.get(i+1)<=masu.get(i)) {
				count++;
			}else {
				count=0;
			}
			if(a<count) {
				a=count;
			}
		}
		
		System.out.println(a);
		sc.close();
	}
}