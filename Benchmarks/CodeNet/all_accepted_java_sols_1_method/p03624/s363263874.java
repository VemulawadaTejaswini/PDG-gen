
import java.util.*;

public class Main {
		public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
			String s = input.nextLine();
			boolean found = false;
			boolean[] arr = new boolean[26];
			for(int i = 0; i < s.length(); i++){
				arr[(int)s.charAt(i)-97] = true;
			}
			for(int i = 0; i < 26; i++){
				if(arr[i] == false){
					System.out.println((char) ( i + 97));
					found = true;
					break;
				}
			}
			
			if(!found){
				System.out.println("None");
			}
		}
}
