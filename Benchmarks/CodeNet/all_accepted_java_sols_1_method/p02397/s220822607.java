import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x, y = 0;
        while(true){
            x = input.nextInt();
            y = input.nextInt();
            if((x == 0) && (y == 0)) break;
            else if(x < y) System.out.println(String.format("%d %d", x, y));
            else System.out.println(String.format("%d %d", y, x));
        }
    }
}

