import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = scn.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println(inning());
        }
    }
    
    private static int inning() {
        int score = 0, out = 0;
        int[] base = new int[3];
        while(out < 3) {
            switch(scn.next()) {
              case "OUT":
                out++;
                break;
              case "HIT":
                score += hit(base);
                break;
              case "HOMERUN":
                score += homerun(base);
                break;
            }
        }
        return score;
    }
    
    private static int hit(int[] base) {
        int point = base[2];
        base[2] = base[1];
        base[1] = base[0];
        base[0] = 1;
        return point;
    }
    
    private static int homerun(int[] base) {
        int point = 1;
        for(int i = 0; i < 3; i++) {
            point += base[i];
        }
        Arrays.fill(base, 0);
        return point;
    }
}