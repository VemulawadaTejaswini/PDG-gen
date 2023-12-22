import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		HashSet<Integer>array=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int i=0;i<N;i++) {
			array.add(sc.nextInt());
		}
		
		if(N!=array.size()) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}

	}

}
