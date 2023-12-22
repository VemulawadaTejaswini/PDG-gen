
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		
			Scanner scan = new Scanner(System.in);
			int i = 0;
			int a =0;
			Integer b[]=new Integer[10];
		
			
		for(i=0;i<10;i++){
			//System.out.println("????????\?????????????????????");
			a = scan.nextInt();
			b[i]=a;
			
			}	
			
		
		 
		for(int j =0;j<3;j++){
			Arrays.sort(b, Collections.reverseOrder());

			System.out.println(b[j]);

			
		}
		

	
}
}