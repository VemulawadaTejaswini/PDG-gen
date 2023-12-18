import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int sum = 0;
		
		for(char c : N.toCharArray()) {

			sum += Character.getNumericValue(c);
          	
			if(sum>=9){
				sum %= 9;
			}
		}
      
       if(sum==0){
			System.out.println("Yes");
       }else{
		System.out.println("No");
	   }
		
		return;
	}

}
