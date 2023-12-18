import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		int N=scan.nextInt();
		int sum=N/1000;
		if(N%1000==0) {
			System.out.println(0);
		}else  {
			sum+=1;
			int goukei=(1000*sum)-N;
			System.out.println(goukei);
		}
	}

}
