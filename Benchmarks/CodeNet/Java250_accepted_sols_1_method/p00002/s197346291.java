import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int x,i;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            x = sc.nextInt();
            x +=sc.nextInt();
            for (i = 1; x / 10 > 0; i++) {
                x = x / 10;
            }
            System.out.println(i);
        }
    }
}