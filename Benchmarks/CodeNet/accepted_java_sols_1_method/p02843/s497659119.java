import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x >= 2000) {
            System.out.println(1);
            return;
        }
        int y = x/100;
        int z = x%100;
        if(z > y * 5) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }


    }

}
