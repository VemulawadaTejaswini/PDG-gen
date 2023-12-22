import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int[] list = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int max = list[0];
		int result=1;
		
        for(int i=1;i<list.length;i++) {
        	if(max <= list[i]) {
        		result++;
        		max = list[i];
        	}
		}
    	System.out.println(result);
	}
}