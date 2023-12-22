import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String N=scan.nextLine();
        if(N.charAt(0)=='7'||N.charAt(1)=='7'||N.charAt(2)=='7'){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}