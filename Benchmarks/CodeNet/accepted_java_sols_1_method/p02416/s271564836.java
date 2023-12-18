import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			//1行読み込む
			String a = sc.nextLine();
			int sum;
			
			//終了条件
			if (a.equals("0")){
				break;
			}
			
            sum = 0;
			for(int i = 0; i < a.length(); i++){
			    sum += a.charAt(i) - '0'; 
			}
			System.out.println(sum);
		}
	}
}

