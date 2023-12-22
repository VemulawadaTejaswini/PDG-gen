import java.util.*;
import java.math.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		while(scan.hasNext()){
			int N = scan.nextInt();
			for(int i = 0; i < N; i++){
				BigInteger a = scan.nextBigInteger();
				BigInteger b = scan.nextBigInteger();
				String bigNum = String.valueOf(a.add(b));
				if(bigNum.length() > 80){
					list.add("overflow");
				} else{
					list.add(bigNum);
				}
			}
		}

		for(String s : list){
			System.out.printf("%s\n", s);
		}
	}
}