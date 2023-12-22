import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String[] strs = str.split(" ");
		if(strs[0].equals(strs[1])) {
			if(!strs[0].equals(strs[2])) {
				System.out.println("Yes");				
			}else {
				System.out.println("No");	
			}
			
		}else if(strs[1].equals(strs[2])) {
			if(!strs[1].equals(strs[0])) {
				System.out.println("Yes");
			}else {
				System.out.println("No");	
			}
		}else if(strs[0].equals(strs[2])) {
			if(!strs[0].equals(strs[1])) {
				System.out.println("Yes");
			}else {
				System.out.println("No");	
			}
		}else {
			System.out.println("No");
			
		}
		
	}

}