import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tate = sc.nextInt();
        
        int yoko = sc.nextInt();
        System.out.print(tate*yoko+" ");//面積
        System.out.println((tate+yoko)*2);//周の長さ
    }
}
