import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        if(x < 0 || y < 0){
            System.out.println("No");
            return;
        }

        if(x - r < 0 || w - x < r || y - r < 0 || h - y < r){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
