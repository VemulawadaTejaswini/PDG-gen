
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tate = scan.nextInt();
        int yoko = scan.nextInt();
        String c = scan.next();
        int i;
        int y;
        for (i = 1; i <= tate; i++) {
            for (y = 1; y <= yoko; y++) {
                if (i == 1 && y == 1 || i == tate && y == yoko || i == 1 && y == yoko || y == 1 && i == tate) {
                    System.out.print("+");
                } else if (y == 1 || y == yoko) {
                    System.out.print("|");
                } else if (i == 1 || i == tate) {
                    System.out.print("-");
                } else if(i==tate/2+1&&y==yoko/2+1){
                    System.out.print(c);
                }else{
                        System.out.print(".");
                        }
            }
            System.out.println("");
        }

    }

}

