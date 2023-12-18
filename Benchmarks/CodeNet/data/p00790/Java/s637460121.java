import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;
            
            Die d = new Die();
            
            while (N-- > 0) {
                String str = sc.next();
                switch (str.charAt(0)) {
                    case 'n': d.north(); break;
                    case 'e': d.east(); break;
                    case 'w': d.west(); break;
                    case 's': d.south(); break;
                    default: break;
                }
            }
            
            System.out.println(d.top);
        }
    }
    
    public static class Die {
        int top;
        int bottom;
        int north;
        int south;
        int east;
        int west;
        
        public Die() {
            top = 1;
            north = 2;
            west = 3;
            bottom = 6;
            south = 5;
            east = 4;
        }
        
        public void north() {
            int tmp = north;
            north = top;
            top = south;
            south = bottom;
            bottom = tmp;
        }
        
        public void south() {
            int tmp = south;
            south = top;
            top = north;
            north = bottom;
            bottom = tmp;
        }
        
        public void east() {
            int tmp = east;
            east = top;
            top = west;
            west = bottom;
            bottom = tmp;
        }
        
        public void west() {
            int tmp = west;
            west = top;
            top = east;
            east = bottom;
            bottom = tmp;
        }
    }
}


