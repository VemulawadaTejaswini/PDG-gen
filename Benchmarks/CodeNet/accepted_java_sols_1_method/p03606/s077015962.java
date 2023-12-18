import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	Scanner scanner=new Scanner(System.in);

    	int n =scanner.nextInt();
    	
    	int result=0;
    	
    	for(int i=0;i<n;i++) {
    		
    		int bufl=scanner.nextInt();
    		int bufr=scanner.nextInt();
    		
    		result+=(bufr-bufl)+1;
    		
    	}
    	
    	System.out.println(result);
    	
    	scanner.close();


    }

}