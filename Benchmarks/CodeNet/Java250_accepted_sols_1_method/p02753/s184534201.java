import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str =  scan.next();
		String[] strArray = str.split("");
		int flag = 0;
		String bs = strArray[0];
		for(int i =0 ; i < 3; i++) {
			if ( ! bs.equals(strArray[i])){
				flag = 1;
			}
			bs = strArray[i];
		}

		if (flag == 1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		} 


	}
}