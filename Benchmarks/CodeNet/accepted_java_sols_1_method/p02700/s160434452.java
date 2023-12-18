import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for(;;){
            c = c - b;
            if(c <= 0){
                System.out.println("Yes");
                break;
            }
            a = a - d;
            if(a <= 0){
                System.out.println("No");
                break;
            }
        }
    }
}