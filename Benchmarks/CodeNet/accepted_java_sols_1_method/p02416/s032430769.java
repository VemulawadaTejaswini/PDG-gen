import java.util.Scanner;


public class Main {

	
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(1000);
		
		while(sc.hasNext()){
			
			
			
			String line = sc.next();
			
			if("0".equals(line)){
				break;
			}
			
			int sum = 0;
			
			for(int i=0; i< line.length();i++){
				
				int digit = Integer.parseInt(String.valueOf(line.charAt(i))); 
				sum += digit;
			}
			sb.append(sum + System.lineSeparator());
		}
		
		System.out.print(sb);
		
		sc.close();
		
	}

}

