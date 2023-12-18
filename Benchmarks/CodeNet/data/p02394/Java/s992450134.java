import java.util.*;

public class Main{
    public static void main(String[] args){
        int w, h, x, y, r;
        Scanner s = new Scanner(System.in);
        w = s.nextInt();
        h = s.nextInt();
        x = s.nextInt();
        y = s.nextInt();
        r = s.nextInt();
        if ((x<r) || (y<r) || (x+r>w) || (y+r>h)){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}

