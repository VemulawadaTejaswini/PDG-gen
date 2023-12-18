import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		while(scan.hasNext()){
			int w = scan.nextInt();
			int i = 1;
			StringBuffer sb = new StringBuffer();
			sb.setLength(0);
			while(w / 2 > 1){
				if(w % 2 == 1){
					sb.append(i).append(' ');
				}
				w /= 2;
				i = i << 1;
			}
			sb.append(i);
			String s = sb.toString().trim();
			System.out.printf("%s\n", s);
		}
	}
}