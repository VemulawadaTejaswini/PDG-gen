import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        if(a%2 == 0 ){
            int b = (int)a/2;
        System.out.println((double)b/a);
        //System.out.println("a");
        }else{
            int b = (int)(a/2)+1;
            System.out.println((double)b/a);
        }
}
}