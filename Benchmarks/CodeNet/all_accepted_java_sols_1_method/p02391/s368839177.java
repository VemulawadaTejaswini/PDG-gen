import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer a = new Integer(sc.nextInt());
        Integer b = new Integer(sc.nextInt());
        int result = a.compareTo(b);
        
        System.out.println(result == 0 ? "a == b" : result < 0 ? "a < b" : "a > b"); 
    }
}
