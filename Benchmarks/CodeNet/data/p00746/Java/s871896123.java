import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    private static ArrayList<Table> alt;
    
    public static void main(String[] args) {
        int n;
        while((n = scn.nextInt()) > 0) {
            alt = createList(n);
            System.out.println(calcSize());
        }
    }
    
    public static ArrayList<Table> createList(int n) {
        ArrayList<Table> list = new ArrayList<>();
        list.add(new Table());
        for(int i = 1; i < n; i++) {
            Table tbl = list.get(scn.nextInt());
            int x = tbl.getX(), y = tbl.getY();
            int dir = scn.nextInt();
            if(dir % 2 > 0) {
                y += dir < 2 ? -1 : 1;
            } else {
                x += dir < 2 ? -1 : 1;
            }
            list.add(new Table(x, y));
        }
        return list;
    }
    
    public static String calcSize() {
        int maxx = 0, minx = 0;
        int maxy = 0, miny = 0;
        for(Table elm : alt) {
            int x = elm.getX();
            int y = elm.getY();
            if(maxx < x) {
                maxx = x;
            }
            if(minx > x) {
                minx = x;
            }
            if(maxy < y) {
                maxy = y;
            }
            if(miny > y) {
                miny = y;
            }
        }
        return (maxx - minx + 1) + " " + (maxy - miny + 1);
    }
}

class Table {
    private int x_, y_;
    
    public Table() {
        this(0, 0);
    }
    
    public Table(int x, int y) {
        x_ = x;
        y_ = y;
    }
    
    public int getX() {
        return x_;
    }
    
    public int getY() {
        return y_;
    }
}