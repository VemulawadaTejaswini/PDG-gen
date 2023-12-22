import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        boolean d = false;
        if(a == 5 && b == 5 && c == 7){
             d = true;
        }else if(a == 5 && b == 7 && c == 5){
            d = true;
        }else if(a == 7 && b == 5 && c == 5){
            d = true;
        }
        if(d){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
