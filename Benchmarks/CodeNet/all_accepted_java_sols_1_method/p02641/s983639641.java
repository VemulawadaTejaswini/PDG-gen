import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		int X=scan.nextInt();
		int N=scan.nextInt();
		List<Integer> list = new ArrayList<>();
		 
		for(int i=0;i<N;i++) {
			int a=scan.nextInt();
			list.add(a);
		}
		
		for(int i=0;i<100;i++) {
			if(!list.contains(X-i)) {
				System.out.println(X-i);
				break;
			}else if(!list.contains(X+i)) {
				System.out.println(X+i);
				break;
			}
		}
	}

}
