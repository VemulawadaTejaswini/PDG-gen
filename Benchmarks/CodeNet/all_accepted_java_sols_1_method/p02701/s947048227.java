import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		List<String> array=new ArrayList<>();
		

		Scanner sc=new Scanner(System.in);
		int kuzi=sc.nextInt();
		
		for(int i=0;i<kuzi;i++) {
			array.add(sc.next());
			
		}
		
		List<String> result=new ArrayList<>(new HashSet<>(array));
		
		System.out.println(result.size());

	}
}