import java.util.*;
public class Main{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int len = s.length();
		for(int i = 0;i < len; ++i){
			if (s.charAt(i) != '?'){
				System.out.print(s.charAt(i));
			}else{
				System.out.print('D');
			}
		}


	}
}