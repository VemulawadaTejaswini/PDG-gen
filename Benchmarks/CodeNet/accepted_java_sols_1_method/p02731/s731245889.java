import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int L = scan.nextInt();//Lは１０００まで
			double tate =0;
			double yoko = 0;
			double takasa = 0;
			
			
			if(L%3==0){
				tate = (double)L/3;
				yoko = (double)L/3;
				takasa = (double)L/3;
				double X = tate*yoko*takasa;
				String str = BigDecimal.valueOf(X).toPlainString();
				System.out.println(str);	
			}else{
				double amari = (double)L%3.0/3.0;
				tate = (double)(L/3)+amari;
				yoko = (double)(L/3)+amari;
				takasa = (double)(L/3)+amari;
				
				double X = tate*yoko*takasa;
				String str = BigDecimal.valueOf(X).toPlainString();
				System.out.println(str);
				
				//System.out.println(amari);
				//System.out.println(L/3.0);
				
				
			}
			
		}
		
		
	}
		

}
