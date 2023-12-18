import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        for(int n; (n = scn.nextInt()) > 0;) {
            ArrayList<Line> lines = new ArrayList<>();
            int m = scn.nextInt(), a = scn.nextInt();
            for(int i = 0; i < m; i++) {
                lines.add(new Line(scn.nextInt(), scn.nextInt(), scn.nextInt()));
            }
            Collections.sort(lines);
            for(Line line : lines) {
                a = line.move(a);
            }
            System.out.println(a);
        }
    }
}

class Line implements Comparable<Line> {
    private int height, left, right;
    
    public Line(int h, int p, int q) {
        height = h;
        left = p;
        right = q;
    }
    
    public int move(int a) {
        if(a == left) {
            a = right;
        } else if(a == right) {
            a = left;
        }
        return a;
    }
    
    public int compareTo(Line obj) {
        return obj.height - height;
    }
}