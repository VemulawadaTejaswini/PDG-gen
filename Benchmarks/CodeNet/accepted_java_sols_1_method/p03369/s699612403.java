import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

    	Scanner sc=new Scanner(System.in);

    	String order=sc.next();
    	
    	
    	int result=700;
    	for(String str:order.split("")) {
    		
    		if(str.equals("o")) {
    			result+=100;
    		}
    	}
    	
    	System.out.println(result);
    }


}





