import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Long> list = new LinkedList<Long>();
		int count = 1;

		while(true){
			long l = sc.nextLong();
			if(l == 0L){
				break;
			}
			list.add(l);
		}
		for(long l:list){
			System.out.println("Case "+count+++": "+l);
		}
	}
}