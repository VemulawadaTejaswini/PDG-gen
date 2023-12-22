import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		//int a=sc.nextInt();
				
		Set<Integer>array=new HashSet<>();
		for(int i=0;i<n;i++) {
			array.add(sc.nextInt());
		}
		
		if(n<=array.size()) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		sc.close();	
	}
}