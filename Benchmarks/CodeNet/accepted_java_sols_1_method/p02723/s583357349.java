import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String v = scan.next();
        if(v.charAt(2) == v.charAt(3) && v.charAt(4) == v.charAt(5)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
