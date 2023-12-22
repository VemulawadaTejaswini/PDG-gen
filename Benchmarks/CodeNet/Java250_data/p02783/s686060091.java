
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int helth = scan.nextInt();
        int power = scan.nextInt();
        
        if(helth%power != 0){
            System.out.println((helth/power)+1);
        }else
            System.out.println(helth/power);
    }
    
}
