import java.util.Scanner;

class Main{
    public static void main(String[] a){ 
    
    	Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		StringBuffer sb = new StringBuffer(line);
		
		System.out.println(sb.reverse());
		
		scanner.close();
		
    } 
}
