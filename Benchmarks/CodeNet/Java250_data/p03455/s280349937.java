import java.util.*;
public class Main {
    public String getGreeting() {
        return "Hello world.";
    }

    public static boolean is_even(int a){
        if(a % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(is_even(a) || is_even(b)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
