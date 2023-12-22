import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = Stream.of(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
		int value=0;
		int result=0;
		int min_result=0;
		
		for(int i=0;i<=1;i++) {
			int cnt=i;
			result=0;
	        for(int j=0;j<list.length;j++) {
	        	value = cnt++ % 2;
	        	if(list[j] != value) result++;
			}
	        if(i==0) min_result = result;
	        else min_result = Math.min(min_result, result);
		}
    	System.out.println(min_result);
	}
}