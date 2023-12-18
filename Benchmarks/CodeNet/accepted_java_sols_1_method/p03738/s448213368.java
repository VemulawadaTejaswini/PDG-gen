import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        if(a>b){
            out.println("GREATER");
        }else if(a==b){
            out.println("EQUAL");
        }else{
            out.println("LESS");
        }
    }
}