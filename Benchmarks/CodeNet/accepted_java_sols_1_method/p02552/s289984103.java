import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
        
        int x = Integer.parseInt(sc.next());
        if(x == 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}