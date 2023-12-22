import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);


	    for(;;){
		    int str1 = Integer.parseInt(scan.next());
		    int str2 = Integer.parseInt(scan.next());

	    	if(str1 == 0 && str2 == 0){
	    		break;
	    	}else if(str1 <= str2){
	    	    System.out.println(str1 +" "+ str2);
	    	}else{
	    	    System.out.println(str2 +" "+ str1);
	    	}
	    }

	}
}