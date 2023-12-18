import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	static final int[] weights = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512 };

	public static void main(String[] args){

		while(scan.hasNext()){
			int w = scan.nextInt();
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < 10; i++){
				if((w & weights[i]) > 0){
					sb.append(weights[i]).append(' ');
				}
			}
			sb.deleteCharAt(sb.length() -1);
			String s = sb.toString();
			System.out.printf("%s\n", s);
		}
	}
}