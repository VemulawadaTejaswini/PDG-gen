        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();

        long sum = a + b + x;

        if(sum<22){
            System.out.println("win");
        }else{
            System.out.println("bust");

        }


    }
}
