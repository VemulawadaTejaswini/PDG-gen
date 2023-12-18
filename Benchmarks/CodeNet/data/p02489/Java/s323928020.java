import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        for (int i=1; true; i++) {
            Scanner input=new Scanner(System.in);
            int x=input.nextInt();
            if (x==0) {
                break;
            }
            System.out.printf("Case %d: %d\n",i,x);
        }
    }
}