import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static long method(long c){
		long checker = 100;
		for (int i = 0; i < c; i++){
			//checker = (long) Math.floor(checker * (1 + 0.01));
			checker *= 1.01;
		}
		return checker;
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long X = Long.parseLong(scan.nextLine());
		long year = 0;
		long head = 0;
		long tail = 3760;
		long center = 0;

		while (head <= tail){
			center = (head + tail) / 2;
			long checker = method(center);
			// = (long) Math.floor(100 * Math.pow((1 + 0.01), center));
			//System.out.println(checker);
			if (checker > X) {
				tail = center - 1;
			}else {
				head = center + 1;
			}
		}

		//System.out.println(head +" "+ center +" "+ tail);

		long[] arr = {head, center, tail};
		Arrays.sort(arr);

		if (X <= method(arr[0])){
			System.out.println(arr[0]);
		}else if (X <= method(arr[1])){
			System.out.println(arr[1]);
		}else if (X <= method(arr[2])){
			System.out.println(arr[2]);
		}
	}
}