import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        
        String[] s = new String[h];
        
        for(int i = 0; i < h; i++){
            s[i] = sc.next();
        }
        
        for(int i = 0; i < w+2; i++) System.out.print("#");
        System.out.println();
        
        for(String str : s){
            System.out.print("#");
            System.out.print(str);
            System.out.print("#");
            System.out.println();
        }
        for(int i = 0; i < w+2; i++) System.out.print("#");
    }
}
