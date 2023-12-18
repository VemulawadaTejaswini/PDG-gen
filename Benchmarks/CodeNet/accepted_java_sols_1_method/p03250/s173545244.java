import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);   
	    
	    int[] map = new int[3];
	    for (int i = 0; i < 3; i++) {
	    	map[i] = sc.nextInt();
	    }
	    
	    Arrays.sort(map);
	    
	    System.out.println(map[0] + Integer.parseInt("" + map[2] + "" + map[1]));
	}    
}	