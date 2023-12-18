import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入
		String s = sc.next();
		List<String> strList = Arrays.asList(s.split(""));
		List<Integer> intList =new ArrayList<>();
		int countOne =0;
		int countZero =0;

		for(String str:strList){
			int num = Integer.parseInt(str);
			if(num==1){
				countOne++;
			}else if (num==0){
				countZero++;
			}
		}


        // System.out.println(countOne);
        // System.out.println(countZero);

        int halfResult = Math.min(countOne,countZero);
        System.out.println(halfResult*2);
 
	}
}
