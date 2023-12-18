import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 0, count = 0;
		while(true){
			count++;
			n = in.nextInt();
			if(n==0) break;
			
			System.out.println("Case "+count+": "+n);
		}
	}

}