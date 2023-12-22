import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    
		int S = sc.nextInt();
		
		int h = S / 3600;
		S = S % 3600;
		
		int m = S / 60;
		S = S % 60;
		
		System.out.printf("%d:%d:%d\n", h, m, S);


	}
}