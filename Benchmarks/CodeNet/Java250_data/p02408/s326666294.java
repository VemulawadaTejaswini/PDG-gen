import java.util.Scanner;

public class Main {
    public static void printMissing(String str, boolean[] tar) {
        for(int i=0;i<13;i++) {
            if(tar[i] == false) {
                System.out.println(str + " " + (i+1));
            }
        }
    }
    public static void main(String[] args) {
        boolean[] s = new boolean[13];
        boolean[] h = new boolean[13];
        boolean[] c = new boolean[13];
        boolean[] d = new boolean[13];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++) {
            String str = in.nextLine();
            String[] lr = str.split(" ");
            int target = Integer.parseInt(lr[1]) - 1;
            switch (lr[0]) {
                case "S":
                    s[target] = true;
                    break;
                case "H":
                    h[target] = true;
                    break;
                case "C":
                    c[target] = true;
                    break;
                case "D":
                    d[target] = true;
                    break;
            }
        }
        printMissing("S", s);
        printMissing("H", h);
        printMissing("C", c);
        printMissing("D", d);
    }
}