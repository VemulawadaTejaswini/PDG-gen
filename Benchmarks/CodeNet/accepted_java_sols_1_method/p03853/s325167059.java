import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        String[] c = new String[h];
        for(int i = 0; i < h; i++) c[i] = scan.next();
        for(int i = 0; i < h; i++){
            System.out.println(c[i]);
            System.out.println(c[i]);
        }
        scan.close();
    }
}