import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int x=scan.nextInt();
        int a=scan.nextInt();
        int b=scan.nextInt();
        if (a>=b){
            System.out.println("delicious");
        }else if (b-a<=x){
            System.out.println("safe");
        }else {
            System.out.println("dangerous");
        }
    }
}
