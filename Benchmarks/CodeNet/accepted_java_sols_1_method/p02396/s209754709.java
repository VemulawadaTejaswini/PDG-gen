import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int i = 1;

        while(x != 0){
            x = sc.nextInt();
            switch (x) {
                case 0: break;
                default: System.out.println("Case " + i + ": " + x); break;
            }
            i++;
        }
    }
}
