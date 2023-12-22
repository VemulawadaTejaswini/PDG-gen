import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        
        if(a>=0){
            if(d>=0){
                System.out.println(b*d);
            }else{
                System.out.println(d*a);
            }
        }else if(b<0){
            if(c>=0){
                System.out.println(b*c);
            }else{
                System.out.println(c*a);
            }
        }else{
            if(d<0){
                System.out.println(c*a);
            }else if(c>=0){
                System.out.println(b*d);
            }else{
                if(a*c>b*d){
                    System.out.println(a*c);
                }else{
                    System.out.println(b*d);
                }
            }
        }
}
}
