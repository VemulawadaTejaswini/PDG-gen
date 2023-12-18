import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int pattern1 = A*2-1;
        int pattern2 = B*2-1;
        int pattern3 = A+B;
        System.out.println(Math.max(pattern3, Math.max(pattern1, pattern2)));      
    }
}