import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<long[]> list = new LinkedList<long[]>();
		int count = 1;

		while(true){
			long a = sc.nextLong();
			long b = sc.nextLong();
			if(a == 0L && b == 0L){
				break;
			}
			list.add(new long[]{a,b});
		}
		for(long[] lary:list){
			long min,max;
			if(lary[0] <= lary[1]){
				min = lary[0];
				max = lary[1];
			}else{
				min = lary[1];
				max = lary[0];
			}
			System.out.println(min+" "+max);
		}
	}
}