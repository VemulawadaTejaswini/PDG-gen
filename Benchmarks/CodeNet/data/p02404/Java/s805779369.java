import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1, b = 1;
        while (a != 0 && b != 0) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a == 0 && b == 0) {
                break;

            }

            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b ; j++) {
                    if (i == 1 && j != b) {
                        System.out.print("#");
                    }
                    else if (i == a && j != b ) {
                        System.out.print("#");
                    }
                    else if (j == b) {
                        System.out.println("#");
                    }
                    else if(j==1){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(".");
                    }
                    
                }
            }System.out.println("");
        }
        
    }
}