import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<String> result = new ArrayList<String>();
		
		int n = stdIn.nextInt();
		stdIn.nextLine();
		for(int i = 0; i < n; i++){
			String str = stdIn.nextLine();
			String after = str.replaceAll("Hoshino", "Hoshina");
			result.add(after);
		}
		
		for(String ans : result){
			System.out.println(ans);
		}
	}
}