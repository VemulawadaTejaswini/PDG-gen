import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    if ((i + 2) % 2 == 1) {
                        if ((j + 2) % 2 == 1&&j!=b) {
                            System.out.print("#");
                        } else if((j + 2) % 2 == 0&&j!=b) {
                            System.out.print(".");
                        }
                        else if((j + 2) % 2 == 1){
                            System.out.println("#");
                            
                        }
                        else{
                            System.out.println(".");
                        }
                    } else if ((j + 2) % 2 == 0&&j!=b) {
                            System.out.print("#");
                        } else if((j + 2) % 2 == 1&&j!=b) {
                            System.out.print(".");
                        }
                        else if((j + 2) % 2 == 0){
                            System.out.println("#");
                            
                        }
                        else{
                            System.out.println(".");
                        }
                }
                
            }
            System.out.println("");
        }
    }
}