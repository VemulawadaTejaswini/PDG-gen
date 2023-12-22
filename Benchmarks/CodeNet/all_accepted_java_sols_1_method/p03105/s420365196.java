import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();
        int c = sn.nextInt();
        
        int d = b / a;
        if(d > c){
            System.out.println(c);
        } else {
            System.out.println(d);
        }
        
        
    }
}