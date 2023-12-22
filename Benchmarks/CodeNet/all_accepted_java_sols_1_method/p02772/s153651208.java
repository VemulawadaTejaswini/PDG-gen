import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int flag = 0;

		int N = scan.nextInt();
		List<Integer>list = new ArrayList<>();

		for(int i=0;i<N;i++) {
			list.add(scan.nextInt());
		}

		for(int num:list) {
			if(num%2==0) {
				if(num%3!=0 && num%5!=0) {
					flag++;
				}
			}
		}

		if(flag==0) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DENIED");
		}
	}

}