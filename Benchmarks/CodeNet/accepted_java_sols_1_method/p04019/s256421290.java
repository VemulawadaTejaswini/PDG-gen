import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(new InputStreamReader(System.in))){
			String line = scan.nextLine();
			
			int n = 0;
			int s = 0;
			int w = 0;
			int e = 0;
			
			for(char c : line.toCharArray()){
				switch(c){
				case 'N':
					n = 1;
					break;
				case 'S':
					s = 1;
					break;
				case 'W':
					w = 1;
					break;
				case 'E':
					e = 1;
					break;
				}
			}
			
			if(n - s == 0 && w - e == 0){
				System.out.print("Yes");
			}else{
				System.out.print("No");				
			}
		}
	}
}
