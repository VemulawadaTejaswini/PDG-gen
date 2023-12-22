import java.util.*;

class Main{
    private static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args){
        int a,b;
        a = s.nextInt();
        b = s.nextInt();
        System.out.println(a * b + " " + (a + b)*2);
    }
}