import java.util.Scanner;


public class Main {
    public static void main(String [] args) {
    	int count=0;
    	while(true) {
    	   Scanner sc = new Scanner(System.in);
    	   String str = sc.nextLine();
    	   if (str.equals("W") || str.equals("w")){
    		   count++;
    	   }
    	   if(str.equals("END_OF_TEXT")) {
    		   System.exit(0);
    	   }
    	   System.out.println(count);
    	   sc.close();
    	}
    	     
    		   
    	   }
    }
