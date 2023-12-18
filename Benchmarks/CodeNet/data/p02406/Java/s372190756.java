import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			if((i + 1) > n) break;
			if((i + 1) % 3 == 0){
				System.out.print(" " + (i + 1));
			}
		}
	}
}
