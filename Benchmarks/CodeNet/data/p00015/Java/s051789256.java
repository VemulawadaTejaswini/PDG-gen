import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		while(scan.hasNext()){
			int N = scan.nextInt();
			for(int i = 0; i < N; i++){
				BigInteger a = scan.nextBigInteger();
				BigInteger b = scan.nextBigInteger();
				String num = String.valueOf(a.add(b));
				if(num.length() > 80){
					System.out.printf("%s\n", "overflow");
				} else{
					System.out.printf("%s\n", num);
				}
			}
		}
	}
}