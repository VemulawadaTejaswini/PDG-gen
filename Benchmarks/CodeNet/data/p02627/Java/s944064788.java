import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        char c = sc.next().charAt(0);
        
        if('a' <= c && c <= 'z'){
            System.out.println("a");
        }else{
            System.out.println("A");
        }
    }
}