import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int i;
        float f=1;
        if (a == 0) {
            System.out.println(f);
        }
        else {
            for (i=2; i<=a; i++) {
                f = f * i;
            }
            System.out.println(f);
        }
    }
}