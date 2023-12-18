import java.util.Scanner;

public class Main {
    Main(){
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        while(true){
            x = sc.nextInt();
            y = sc.nextInt();
            if (x == 0 && y == 0)break;
            System.out.printf("%d %d\n", Math.min(x, y),Math.max(x, y));
        }
    }

    public static void main(String[] args){
        new Main();
    }
}

