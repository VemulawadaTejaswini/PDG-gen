import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
        
        String s = sc.next();
        
        if(s.charAt(s.length()-1) == 's'){
            System.out.println(s + "es");
        }else{
            System.out.println(s + "s");
        }
    }
}