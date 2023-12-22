import java.util.Arrays;
import java.util.Scanner;


public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final String one = sc.next();
			final String two = sc.next();
			
			if("0".equals(one) && "0".equals(two)){
				break;
			}
			
			char[] one_c = one.toCharArray();
			char[] two_c = two.toCharArray();
			
			int hit_count = 0, blow_count = 0;
			
			for(int i = 0; i < one_c.length; i++){
				for(int j = 0; j < two_c.length; j++){
					if(one_c[i] == two_c[j]){
						if(i == j){
							hit_count++;
						}else{
							blow_count++;
						}
						
						break;
					}
				}
			}
			
			System.out.println(hit_count + " " + blow_count);
			
			
		}
		
		
	}
}