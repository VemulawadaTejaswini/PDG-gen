import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int r; //最大公約数
    while(true) {
        r=x%y;
        x=y;
        y=r;
        if(r==0) break;
    }
    System.out.println(x);
    }
}

