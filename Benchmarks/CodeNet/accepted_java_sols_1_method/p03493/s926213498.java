import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] strs = sc.next().split("");

		int result = Arrays.stream(strs)
			.mapToInt(Integer::parseInt)
			.sum();
      
		System.out.println(result);
	}
}
