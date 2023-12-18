import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan_ = new Scanner(System.in);
        int w_ = scan_.nextInt();
        int h_ = scan_.nextInt();
        int x_ = scan_.nextInt();
        int y_ = scan_.nextInt();
        int r_ = scan_.nextInt(); 
    
        if(w_ -(x_ + r_) >= 0 && h_ - (y_ + r_) >= 0
           && x_ - r_ >= 0 && y_ - r_ >= 0){

            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

