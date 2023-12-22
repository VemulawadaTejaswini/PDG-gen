import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int waru = n / 100;
        int x = waru * 100;
        int y = waru * 10;
        int z = waru * 1;
        int w = x + y + z;
        if(n <= w){
            System.out.println(w);
        }
        else {
            System.out.println(w + 111);
        }
    }
}
