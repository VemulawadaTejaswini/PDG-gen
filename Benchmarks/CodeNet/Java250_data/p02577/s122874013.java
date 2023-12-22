import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int answer = 0;
		String max;
		int w =0;
		while(w != n.length()){
			char c = n.charAt(w);
			int i = Character.getNumericValue(c);
			answer += i; 
			w++; 
		}
		if(answer % 9 == 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
