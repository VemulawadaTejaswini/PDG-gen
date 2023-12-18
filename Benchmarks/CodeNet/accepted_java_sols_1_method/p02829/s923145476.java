import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a==1 && b==2) {
            System.out.println(3);
        } else if(a==1 && b==3){
            System.out.println(2);
        } else if(a==2 && b==3){
            System.out.println(1);
        } else if (a==3 && b==1) {
            System.out.println(2);
        } else if(a==3 && b==2) {
            System.out.println(1);
        } else if (a==2 && b==1) {
            System.out.println(3);
        }

    }
}
