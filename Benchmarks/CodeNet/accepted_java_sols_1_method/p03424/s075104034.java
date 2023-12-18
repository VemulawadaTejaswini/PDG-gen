
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        boolean yellow = false;
        int N = s.nextInt();
        for(int i = 0; i < N; i++){
            if(s.next().charAt(0) == 'Y')
                yellow = true;
        }
        
        if(yellow){
            System.out.println("Four");
        }else{
            System.out.println("Three");
        }
    }
    
}
