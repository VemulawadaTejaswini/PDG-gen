import java.util.Scanner;

public class Main{
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int K = sc.nextInt();
		String input = sc.next();
		
		//System.out.println(input);
		
		char c []  = input.toCharArray();
		sc.close();
		
		c[K-1] = Character.toLowerCase(c[K-1]);
		String output = new String(c);
		System.out.println(output);
		
	}

}
