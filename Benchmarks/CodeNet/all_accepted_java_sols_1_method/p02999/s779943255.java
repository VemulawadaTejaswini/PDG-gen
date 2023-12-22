import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int A = sc.nextInt();
        
        if (X < A) {
            System.out.println(0);
        }else{
            System.out.println(10);
        }
    }
}