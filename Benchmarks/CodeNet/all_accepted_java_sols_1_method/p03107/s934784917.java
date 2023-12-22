import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder n = new StringBuilder(in.next());
		
		int count = 0;
		for(int i=n.length()-2;i>=0;i--) {
			if(n.charAt(i)!=n.charAt(i+1)) {
				count++;
				n.delete(i,i+2);
				if(i==n.length()) {
					i--;
				}
				
				
			}
		
	}
		
		System.out.println(count*2);
		
		
		
		
		
	}
	

}
