import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.nextLine();
		String p;
		List<String> temp = new ArrayList<String>();
		while( !(p = sc.nextLine()).equals("END_OF_TEXT")){
			for(String in : p.split(" ")){
				temp.add(in);
			}
		}
		int ans = 0;
		for(String str : temp){
			if(str.equalsIgnoreCase(w)){
				ans++;
			}
		}
		System.out.println(ans);
	}
}