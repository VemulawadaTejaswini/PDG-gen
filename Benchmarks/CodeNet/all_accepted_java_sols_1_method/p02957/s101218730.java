import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = A+B;
        if(sum%2==0) System.out.println(sum/2);
        else System.out.println("IMPOSSIBLE");
    }
}
