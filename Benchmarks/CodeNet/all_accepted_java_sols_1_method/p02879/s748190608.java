import java.util.Scanner;

public class Main {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        input.nextLine();
        if(a / 10 != 0 || b / 10 != 0){
            System.out.println(-1);
        }
        else{
            System.out.println(a*b);
        }
    }
}
