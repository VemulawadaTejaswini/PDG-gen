import java.util.*;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	
	public static HashMap<String,String> map = new HashMap<>();


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int r = sc.nextInt();
		int ans = 0;
		if(h + r == 0) ans = 0;
		else if(h + r < 0) ans = -1;
		else ans = 1;
		System.out.println(ans);
	}
}