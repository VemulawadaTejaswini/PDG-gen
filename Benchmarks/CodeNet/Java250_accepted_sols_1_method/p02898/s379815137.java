import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		//遊ぶ人数
		int k=sc.nextInt();		//身長制限
		int count=0;
		
		for(int i=0;i<n;i++) {
			int h=sc.nextInt();
			if(k<=h) {
				count+=1;
			}
		}
		System.out.println(count);

	}

}