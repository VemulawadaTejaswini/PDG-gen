import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next() + sc.next();
        int b = Integer.parseInt(a);
        int c = (int)Math.sqrt((double)(b));
        if(b == c*c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}