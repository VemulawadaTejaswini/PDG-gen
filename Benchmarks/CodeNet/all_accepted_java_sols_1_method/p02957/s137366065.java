import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        if((b+a)%2==0){
            System.out.println((b+a)/2);
        }else{
            System.out.println("IMPOSSIBLE");
        }
    }
}