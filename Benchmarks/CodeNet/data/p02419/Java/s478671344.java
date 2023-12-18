
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int count = 0;
		while(sc.hasNext()){
			
			String scanWord = sc.next().toLowerCase();
			
			if("END_OF_TEXT".equals(scanWord)){
				break;
			}
			
			if(scanWord.equals(word)){
				
				count++;
			}
		}
		
		
		System.out.println(count);
		
		
		sc.close();
	}
	
	
}

