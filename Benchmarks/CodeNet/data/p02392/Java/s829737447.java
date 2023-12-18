import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner Sc =new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();

        if(a < b && b < c){
            System.out.printf("Yes /n");
        } else {
            System.out.printf("No /n");
        }
    }
}
