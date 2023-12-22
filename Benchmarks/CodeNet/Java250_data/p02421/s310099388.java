
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		 
		        int n = scanner.nextInt();
		        int tarop = 0;
		        int hanakop = 0;
		        String tarow;
		        String hanakow;
		 
		        for(int i = 0; i < n; i++){
		            tarow=scanner.next();
		            hanakow=scanner.next();
		            if(tarow.compareTo(hanakow) < 0)  {      hanakop =hanakop+ 3;}
		            else if(tarow.compareTo(hanakow) > 0)   tarop = tarop+3;
		            else {
		                hanakop=hanakop+1;
		                tarop=tarop+1;
		            }
		        }
		 
		        System.out.println(tarop + " " + hanakop);
		    }

}

