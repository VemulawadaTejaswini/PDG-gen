import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        int ceil = (int)Math.ceil((double)(a + b)/2);
        System.out.println(ceil);
    }
}