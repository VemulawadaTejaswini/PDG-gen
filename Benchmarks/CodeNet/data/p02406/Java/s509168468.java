import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = Integer.parseInt(str);

        for(int x = 1; x <= a; x++){
            if(x % 10 == 3) System.out.print(" " + x);
            else if(x % 3 == 0) System.out.print(" " + x);
        }
        System.out.println();

    }

}