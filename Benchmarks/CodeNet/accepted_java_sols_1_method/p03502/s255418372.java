import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		
		char[] chr = str.toCharArray();
		
		int temp = 0;
		
		for (int i=0 ; i<chr.length; i++ ){
			
			temp += Character.getNumericValue(chr[i]);
		}
		
		if (Integer.valueOf(str) % temp== 0){
			
			System.out.println("Yes");
			
		}
		else
		{
			
			System.out.println("No");
		}

	}
}