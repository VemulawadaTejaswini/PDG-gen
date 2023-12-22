import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
		String s = sc.next();
		String[] sArray = s.split("");
		if( sArray.length == 2 ) {
			System.out.println(s);
		} else if (sArray.length == 3) {
			String s3ans = sArray[2] + sArray[1] + sArray[0];
			System.out.println(s3ans);
		}	
	}
}
