import java.util.*;
public class Main {// Main
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        boolean isExists = false;
        while(a > 0) {
            if(a%10 == 7) {
                isExists = true;
                break;
            }
            a = a/10;
        }
        if(isExists) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
