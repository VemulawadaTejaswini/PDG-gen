import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner scan_ = new Scanner(System.in);
        
        while(scan_.hasNext()) {
        int a_ = scan_.nextInt();
        int b_ = scan_.nextInt();
       if(a_ != 0 | b_ != 0){
       if(a_ <= b_){
            System.out.println(a_ + " " + b_);
        }else{
            System.out.println(b_ + " " + a_);
        }
        }
    }
    }
}

