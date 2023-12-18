import java.util.*;
import java.math.*;
 import static java.util.stream.Collectors.toList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入

		int n = sc.nextInt();
		int x = sc.nextInt();
		
		List<Integer> listL = new ArrayList<>();
		int totalLength =0;
		int resultCount=1;

		for(int i=0;i<n;i++){

			int ln =sc.nextInt();
			totalLength+=ln;
			if(totalLength>x){
				break;				
			}
			resultCount++;

		}

		
		System.out.println(resultCount);
 
	}

}


