import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] t = {1, 2, 4, 8, 16, 32, 64, 101};
		for(int i = 0; i < t.length; i++){
			if(t[i] > N){
				System.out.println(t[i-1]);
				break;
			}
		}
	}
}