import java.util.*;
public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int w = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        
        if(x-r >= 0 && x+r <= w && y-r >= 0 && y+r <= h) System.out.println("Yes");
        else System.out.println("No");

    }

}

