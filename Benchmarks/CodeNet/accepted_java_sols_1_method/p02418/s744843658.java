import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.next();
        String p = scanner.next();
        
        String tmp = s + s;
        
        String result = "No";
        if ( tmp.indexOf(p) == -1) {
            result = "No";
        } else {
            result = "Yes";
        }
        
        System.out.println(result);
        
    }
}
