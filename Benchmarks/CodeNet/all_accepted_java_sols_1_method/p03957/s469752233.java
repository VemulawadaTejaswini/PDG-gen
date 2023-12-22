import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String x =sc.nextLine();
		
		char[] a = x.toCharArray();
		
		int p , q = 0;
		
		p = x.lastIndexOf('F');
		
		for (int i = p; i >= 0 ; i--){
			if(a[i] == 'C'){
				q++;
				break;
			}
		}
		if(q > 0){
			System.out.println("Yes");
		}
		if(q == 0){
			System.out.println("No");
		}	
		sc.close();
	}
}
