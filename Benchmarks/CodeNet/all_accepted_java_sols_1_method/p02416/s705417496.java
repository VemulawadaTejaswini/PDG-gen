import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        over:
        while(true){
            String line = sc.next();
            int a = line.length();
            int b = 0;
            char x;
            for(int i= 0; i < a; i++){
                x = line.charAt(i);
                if(a == 1 && x == 48) {
                    break over;
                }
                b = b + (x - 48);
            }
            System.out.println(b);
        }
    }
}
