import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.nextLine());
		
		switch(a % 10){
		    case 3 :
		        System.out.println("bon");
		        break;
		    
		    case 0 :
		        System.out.println("pon");
		        break;
		    
		    case 1 :
		        System.out.println("pon");
		        break;
		    
		    case 6 :
		        System.out.println("pon");
		        break;
		        
            case 8 :
                System.out.println("pon");
		        break;
		        
		    default : 
		        System.out.println("hon");
		}
		
    }
}