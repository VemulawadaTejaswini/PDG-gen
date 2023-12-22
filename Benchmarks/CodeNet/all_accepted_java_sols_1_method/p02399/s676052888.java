import java.util.*;
import java.math.*;

class Main {
    public static void main (String[] args) {
        Scanner scan_ = new Scanner(System.in);
        int a_ = scan_.nextInt();
        int b_ = scan_.nextInt();
      
        int d_ = a_/b_;
        int r_ = a_%b_;
        Number f_ = (1.0*a_)/(1.0 * b_);
       
       //BigDecimal d_ =new BigDecimal( (1.0 * a_) /(1.0 *  b_));
       // d_ = d_.setScale(5);
        System.out.println(d_ + " " + r_ + " " + String.format("%.8f", f_));
    }
}
