import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long C = sc.nextInt();
        System.out.println(C - (A - B) >= 0 ? C - (A - B) : 0);
    }
}
