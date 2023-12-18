import java.util.Scanner;

public class Main {
	public static void main(String args[]){
	  	Scanner scanner = new Scanner(System.in);
		int x = 1;
		int i = 0;
		
		while(x == 0){
		int  num = scanner.nextInt();
		
		if(num == 0)
			x = 0;
		else
        	System.out.println("Case "+ i + ": "+ num );
        
        i ++;
        }
    }
}
