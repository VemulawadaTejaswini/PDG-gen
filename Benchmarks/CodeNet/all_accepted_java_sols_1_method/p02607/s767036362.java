import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		int N=scan.nextInt();
		int[] masu=new int[N];
		int count=0;
		for(int i=0;i<N;i++) {
			masu[i]=scan.nextInt();
		}
		for(int i=0;i<N;i++) {
			if(i%2==0) {
				if(masu[i]%2!=0) {
					count+=1;
				}
			}
		}
		System.out.println(count);
	}

}
