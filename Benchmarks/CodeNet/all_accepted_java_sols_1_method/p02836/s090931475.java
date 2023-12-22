
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int count = 0;
		for(int i=0; i<=(s.length()-1)/2; i++) {
			if(s.charAt(i)==s.charAt(s.length()-i-1)) {
				continue;
			}else {
				count ++;
			}
		}
		System.out.println(count);
	}

}
