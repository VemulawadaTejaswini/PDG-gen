import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = 0;

        while (j == 0) {
            int tyukan = scanner.nextInt();
            int kimatu = scanner.nextInt();
            int saishi = scanner.nextInt();

            if (tyukan == -1 && kimatu == -1 && saishi == -1) {
                break; 
            }else if(tyukan==-1||kimatu==-1){
                System.out.println("F");
            } 
            else if ((tyukan + kimatu) >= 80) {
                System.out.println("A");
            } else if ((tyukan + kimatu) >= 65) {
                System.out.println("B");
            } else if ((tyukan + kimatu) >= 50||saishi>=50) {
                System.out.println("C");
            } else if ((tyukan + kimatu) >= 30) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }
}