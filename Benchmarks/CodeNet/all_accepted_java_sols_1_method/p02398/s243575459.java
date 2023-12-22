import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int num = 0;
        
        for (int i=a; i<=b; i++) {
            if (c % i == 0) {
                num++;
            }
        }
        
        System.out.println(num);
    }
}

