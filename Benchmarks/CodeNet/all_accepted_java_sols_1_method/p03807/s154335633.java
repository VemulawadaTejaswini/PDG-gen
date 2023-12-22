
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num;
		int count = 0;
		num = scan.nextInt();
		for(int i = 0; i < num; i++){
			int tmp = scan.nextInt();
			if(tmp % 2 == 1){
				count++;
			}
		}
		if(count % 2 == 0){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}