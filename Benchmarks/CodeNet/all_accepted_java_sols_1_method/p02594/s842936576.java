import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int x = Integer.parseInt(sc.next());
        
        if(x >= 30){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}