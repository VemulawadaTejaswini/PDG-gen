import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        for(int i = 0; i < w + 1; i++){
            System.out.print("#");
        }
        System.out.println("#");
        for(int i = 0; i < h; i ++){
            System.out.print("#");
            System.out.print(sc.next());
            System.out.println("#");
        }
        for(int i = 0; i < w + 2; i++){
            System.out.print("#");
        }
    }
}
