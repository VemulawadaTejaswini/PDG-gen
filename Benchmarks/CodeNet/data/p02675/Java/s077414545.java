import java.util.*;

 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        scan.close();

        switch (num.charAt(num.length()-1)) {
            case 2,4,5,7,9:
                System.out.println("hon");                
                break;
        
            case 0,1,6,8:
                System.out.println("pon");
                break;
            
            default:
                System.out.println("bon");
                break;
        }
    }
}

