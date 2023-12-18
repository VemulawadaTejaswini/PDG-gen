import java.util.Scanner;
import java.util.ArrayList;


class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 1;
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		String str1 = "+";
		String str2 = "-";
		String str3 = "*";
		String str4 = "/";
		String str5 = "?";
		
		if(0 <= a && b <= 20000){
			while(true){
				
				a = sc.nextInt();
				String enzan = sc.next();
				b = sc.nextInt();
				int c = 0;
				
				
				
				if(enzan.equals(str1)){
					c = a + b;
					array.add(c);
				}
				else if(enzan.equals(str2)){
					c = a - b;
					array.add(c);
				}
				else if(enzan.equals(str3)){
					c = a * b;
					array.add(c);
				}
				else if(enzan.equals(str4)){
					c = a / b;
					array.add(c);
				}
				else if(enzan.equals(str5))
					break;
			
			}
		
		}
		
		for(int i = 0; i<array.size(); i++){
			
			System.out.println(array.get(i));
		}
	}

}