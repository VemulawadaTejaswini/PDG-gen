import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int j = 0;

	    for(char x: str.toCharArray()) {
	        if(x == '1') {
	            j++;
	        }
	    }
		// 出力
		System.out.println(j);
	}
}
