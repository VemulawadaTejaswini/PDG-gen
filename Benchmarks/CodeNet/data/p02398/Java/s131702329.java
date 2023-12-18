import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
	                                         
    	
	Scanner scanner = new Scanner(System.in);
    	int a = scanner.nextInt();
    	int b = scanner.nextInt();
    	int c = scanner.nextInt();
    	int y =0;
    	for (int z=a;z<=b;z++){
    		if ( c % z == 0){
    			y++;
    		}
    		//System.out.println(y);
    	}
    	System.out.println(y);
	}
}