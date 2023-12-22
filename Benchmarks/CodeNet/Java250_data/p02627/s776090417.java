import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(Character.isLowerCase(s.charAt(0))){
            System.out.println("a");
        }else{
            System.out.println("A");
        }
    }
}
