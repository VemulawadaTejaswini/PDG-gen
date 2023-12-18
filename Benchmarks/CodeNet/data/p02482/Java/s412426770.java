import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int q = scan.nextInt();
        if(p>q){
          System.out.printIn("a > b");
        }else if(p==q){
          System.out.printIn("a = b");
        }else if(p<q){
          System.out.printIn("a < b");
        }
 }
}
       