import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; sc.hasNext(); i++){
			
			int j = 0;
			j = sc.nextInt();

			if (j != 0){
				System.out.println("Case " + i + ": " + j);
			} else {
				break;
			}
			
		}
	}
}