import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan_ = new Scanner(System.in);
        int i = 1;
        int x;
        while(scan_.hasNext()){
            x = scan_.nextInt();
            if(x != 0){
            System.out.println("Case " + i++ +": " + x );
            }
        }
}
}

