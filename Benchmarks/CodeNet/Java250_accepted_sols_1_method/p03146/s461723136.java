import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * @author morisin
 * 
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int S = sc.nextInt();
		
		int nextNum = S;
		
		Set<Integer> list = new HashSet<>();
		
		list.add(S);

		int size_before=0;
		int size_after=0;
		
		for(int i=2;i<=1000000;i++) {
			size_before=list.size();
			if(nextNum%2 == 0) {
				nextNum=nextNum/2;
				list.add(nextNum);
			}else {
				nextNum=nextNum*3+1;
				list.add(nextNum);
			}
			size_after=list.size();
			
			if(size_before==size_after) {
				System.out.println(i);
				break;
			}
		}
	}
}
