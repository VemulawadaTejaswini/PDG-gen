import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		List<String> sl = new ArrayList<String>(Arrays.asList(s.split("/")));
		
		if(Integer.parseInt(sl.get(0)) < 2019) {
			System.out.println("Heisei");
		}else if(Integer.parseInt(sl.get(1)) < 5){
			System.out.println("Heisei");
		}else {
			System.out.println("TBD");
		}
		
		sc.close();
		
		
		
	}
}