import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = C-(A-B);
        if(sum < 0){
            sum = 0;
        }
        System.out.println(sum);
    }
}