import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		String c = scan.next();
		
		int sum = a.length() + b.length() + c.length();
		
		int flag = 0;
		
		int f_a = 0;
		int f_b = 0;
		int f_c = 0;
		
		for(int i = 0 ; i < sum ; i++){
			
			if(flag == 0){
				
				if(f_a == a.length()){
					
					System.out.println("A");
					break;
				}
				
				if(a.charAt(f_a) == 'a'){
					flag = 0;
				} else if(a.charAt(f_a) == 'b'){
					flag = 1;
				} else if(a.charAt(f_a) == 'c'){
					flag = 2;
				}
				
				f_a++;
				
			
			} else if(flag == 1){
				
				if(f_b == b.length()){
					
					System.out.println("B");
					break;
				}
				
				if(b.charAt(f_b) == 'a'){
					flag = 0;
				} else if(b.charAt(f_b) == 'b'){
					flag = 1;
				} else if(b.charAt(f_b) == 'c'){
					flag = 2;
				}
				
				f_b++;
				
			
			} else if(flag == 2){
				
				if(f_c == c.length()){
					
					System.out.println("C");
					break;
				}
				
				if(c.charAt(f_c) == 'a'){
					flag = 0;
				} else if(c.charAt(f_c) == 'b'){
					flag = 1;
				} else if(c.charAt(f_c) == 'c'){
					flag = 2;
				}
				
				f_c++;
				
			}
			
		}
	}
}
