import java.util.Scanner;

class Main{
      public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	String number;
    	char[] ca;
    	int num;
    	
    	for(;;){
    		number = scan.next();
    		ca =  number.toCharArray();
    		num = 0;
    		
    		if(ca[0] == '0'){
    			break;
    		}
	    	for(int i = 0; i < ca.length; i++){
	    		num += ca[i] - '0';
	    	}
	    	System.out.println(num);
    	}
     }
}