
import java.util.Scanner;

public class Main{
	
	

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int D=sc.nextInt();
    int x2000=sc.nextInt();
    int temp=x2000;
    for(int i=0;i<10;i++) {
    	temp=r*temp-D;
    	System.out.println(temp);
    }
   
    

	
	
	
    

		
	}
	

	
}
		

