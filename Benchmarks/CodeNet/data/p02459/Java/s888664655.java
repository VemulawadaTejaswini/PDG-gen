import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Map<String,Integer> sales = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for(int i = 0; i < a;i++){
			int x= sc.nextInt();
			String key = sc.next();
			if(x ==0){
				sales.put(key,sc.nextInt());
			}else{
				System.out.println(sales.get(key));

			}
		}
	}
}

