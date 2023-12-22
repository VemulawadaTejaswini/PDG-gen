import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int count=0;
		int hikari =1;//光るボタンのインデックス
		for (int i=0;;i++){
			hikari = a[hikari-1];
			count++;
			if(hikari==2) {
				break;
			}else if(count>n) {
				count=-1;
				break;
			}
		}

		System.out.println(count);

	}

}
