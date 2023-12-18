import java.util.*;
public class Air_Conditioner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        if(x >= 30) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}