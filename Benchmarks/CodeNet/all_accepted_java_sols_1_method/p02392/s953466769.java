import java.util.*;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		
		 scanner = new Scanner(System.in);
		int x = scanner.nextInt();
	        int y = scanner.nextInt();
	        int z = scanner.nextInt();
	         
	        if(x<y && y<z){
	            System.out.println("Yes");
	        }else{
	            System.out.println("No");
	        }

	}

}