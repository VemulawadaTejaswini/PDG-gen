import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] ary = new int[4][13];
        for(int i = 0, n = scn.nextInt(); i < n; i++) {
            String s = scn.next();
            int p, v = scn.nextInt();
            if(s.equals("S")) {
                p = 0;
            } else if(s.equals("H")) {
                p = 1;
            } else if(s.equals("C")) {
                p = 2;
            } else {
                p = 3;
            }
            ary[p][~-v]++;
        }
        for(int i = 0; i < 52; i++) {
            if(ary[i / 13][i % 13] < 1) {
                switch(i / 13) {
                  case 0:
                    System.out.print("S");
                    break;
                  case 1:
                    System.out.print("H");
                    break;
                  case 2:
                    System.out.print("C");
                    break;
                  case 3:
                    System.out.print("D");
                    break;
                }
                System.out.println(" " + (i % 13 + 1));
            }
        }
    }
}