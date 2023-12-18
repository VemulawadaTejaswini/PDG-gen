import java.util.*;
 
class AOJ10008{
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
     
    System.out.println(a / b);
    System.out.println(a % b);
    System.out.println((double)a / (double)b);
    }
}