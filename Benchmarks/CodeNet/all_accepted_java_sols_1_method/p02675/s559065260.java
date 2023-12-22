import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        String ans = N.substring(N.length()-1);

        if(ans.equals("0") || ans.equals("1") || ans.equals("6") || ans.equals("8")){
            System.out.println("pon");
        }else if(ans.equals("2") || ans.equals("4") || ans.equals("5") || ans.equals("7") || ans.equals("9")){
            System.out.println("hon");
        }else{
            System.out.println("bon");
        }

        
    }
}