import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner (System.in);
		
		long n =sc.nextInt();
		
		int height1=sc.nextInt();
		int height2=0;
		
		int takadai=0;
		long sum=0;
		
		for(int i=0;i<(n-1);i++) {
			height2 = sc.nextInt();
			if(height1>height2) {
				takadai = height1 - height2;
				sum = sum + takadai;
			}else {
				height1 = height2; 
			}
		}
		
		System.out.println(sum);
	}

}