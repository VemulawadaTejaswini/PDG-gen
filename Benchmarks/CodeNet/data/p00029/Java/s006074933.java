import java.util.*;
public class Main {
	
	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		
		String input = stdIn.nextLine();
		System.out.println(input);
		String[] str = input.split(" ");
		
		Arrays.sort(str);
		String ans = "";
		for(int r = 0; r < str.length; r++) {
			if(str[r].length() > ans.length()) ans = str[r]; 
		}
		System.out.println(str[str.length - 1] + " " + ans);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}