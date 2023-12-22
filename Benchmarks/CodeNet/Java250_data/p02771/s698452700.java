import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        String answer = "YES";
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.next());
        int b = Integer.parseInt(s.next());
        int c = Integer.parseInt(s.next());
        if(a == b || b == c || c == a){
            if( a == b && b == c ){
                System.out.println("No");
                return;
            }
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}