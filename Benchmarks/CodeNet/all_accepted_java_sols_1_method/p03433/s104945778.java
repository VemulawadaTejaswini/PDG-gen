import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        String ans = "No";
        if(N%500<=A) ans = "Yes";
        System.out.println(ans);


    }
}