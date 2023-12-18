
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();

        if((y%2)!=0||y>(x*4)||y<(x*2)){
            System.out.println("No");
            return;
        }else{
            System.out.println("Yes");
        }

        scn.close();

    }

}