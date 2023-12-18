import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		int []a=new int[5];
		for(int i=0;i<5;i++) {
			int n=scan.nextInt();
			a[i]=n;
		}
		
		for(int i=0;i<5;i++) {
			if(a[i]==0) {
				System.out.println(i+1);
			}
		}
	}

}
