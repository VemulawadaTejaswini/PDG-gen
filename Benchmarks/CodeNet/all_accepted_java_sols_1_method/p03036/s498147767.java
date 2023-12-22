import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int r = kbd.nextInt();
        int d = kbd.nextInt();
        int x = kbd.nextInt();
        int temp = x;
        for(int i=0;i<10;i++){
            temp = r*temp - d;
            System.out.println(temp); 
        }
    }
}