import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int r;
        while(x != 0){
            r = y%x;
            y = x;
            x = r;
        }
        System.out.println(y);
    }
}
