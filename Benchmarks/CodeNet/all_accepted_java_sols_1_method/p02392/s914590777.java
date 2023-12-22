import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan_ = new Scanner(System.in);
        int a_ = scan_.nextInt();
        int b_ = scan_.nextInt();
        int c_ = scan_.nextInt();
        if(a_ < b_ && b_ < c_){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

