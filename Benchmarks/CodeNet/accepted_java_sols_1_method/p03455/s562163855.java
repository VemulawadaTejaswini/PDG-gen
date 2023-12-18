import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a*b%2;
        if(c > 0) {
            System.out.print("Odd");  
        } else {
            System.out.print("Even");  
        }
    }
}