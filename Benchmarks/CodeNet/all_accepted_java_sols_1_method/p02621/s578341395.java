import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
      	double power1 = Math.pow(num, 2);
        double power2 = Math.pow(num, 3);
      	double answer = num + power1 + power2;
   
      	System.out.println((int)answer);
    }
}