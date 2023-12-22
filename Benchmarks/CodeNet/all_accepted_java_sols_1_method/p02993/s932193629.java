import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        boolean t = true;

        for(int i = 0;i < a.length()-1;i++){
            if (a.charAt(i) == a.charAt(i + 1)) {
                t = false;
                break;
            }
        }
        
        if (t) {
            System.out.println("Good");
        }else{
            System.out.println("Bad");
        }
    }
}