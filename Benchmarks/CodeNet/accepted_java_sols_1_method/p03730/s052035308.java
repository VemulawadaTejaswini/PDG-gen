import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean isPossible = false;

        for (int i = 0; i < b; i++) {
            if ( (i*a % b) == c) {
                isPossible = true;
                break;
            }
        }

        if (isPossible){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }



    }

}



