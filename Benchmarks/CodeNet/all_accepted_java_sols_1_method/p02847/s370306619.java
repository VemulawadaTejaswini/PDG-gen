
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.equals("SUN")){
            System.out.print(7);
        }else if(str.equals("MON")){
            System.out.print(6);
        }else if(str.equals("TUE")){
            System.out.print(5);
        }else if(str.equals("WED")){
            System.out.print(4);
        }else if(str.equals("THU")){
            System.out.print(3);
        }else if(str.equals("FRI")){
            System.out.print(2);
        }else if(str.equals("SAT")){
            System.out.print(1);
        }
       
    }
    
}
