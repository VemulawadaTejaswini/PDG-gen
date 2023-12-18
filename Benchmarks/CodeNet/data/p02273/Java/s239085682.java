import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        List<Point> list = koch(Arrays.asList(new Point(0, 0), new Point(100, 0)), n);
        
        for (Point p : list) System.out.println(p);
    }
    
    private List<Point> koch(List<Point> list, int n) {
        if (n == 0) return list;
        List<Point> newList = new ArrayList<Point>();
        newList.add(list.get(0));
        for (int i = 0; i < list.size() - 1; i++) {
            Point p1 = list.get(i), p2 = list.get(i+1);
            double x = (p2.getX() - p1.getX()) / 3;
            double y = (p2.getY() - p1.getY()) / 3;
            Point s = new Point(p1.getX() + x, p1.getY() + y);
            Point t = new Point(s.getX() + x, s.getY() + y);
            double ux = s.getX() + x * Math.cos(Math.PI/3) - y * Math.sin(Math.PI/3);
            double uy = s.getY() + x * Math.sin(Math.PI/3) + y * Math.cos(Math.PI/3);
            Point u = new Point(ux, uy);
            newList.add(s);
            newList.add(u);
            newList.add(t);
            newList.add(p2);
        }
        return koch(newList, n - 1);
    }
    
    private static class Point {
        private double x, y;
        Point (double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX() { return x; }
        public double getY() { return y; }
        @Override public String toString() {
            return new StringBuilder().append(x).append(' ').append(y).toString();
        }
    }
    
    private void print(Object[] xs) {
        StringBuilder sb = new StringBuilder();
        for (Object x : xs) sb.append(x.toString()).append(' ');
        System.out.println(sb.toString().trim());
    }
    
    private void print(int[] xs) {
        StringBuilder sb = new StringBuilder();
        for (int x : xs) sb.append(x).append(' ');
        System.out.println(sb.toString().trim());
    }
    
    private static class Scanner {
        BufferedReader r;
        StreamTokenizer st;
        
        public Scanner(InputStream in) {
            r = new BufferedReader(new InputStreamReader(in));
            st = new StreamTokenizer(r);
        }
        
        public String next() {
            nextToken();
            return st.sval;
        }
        
        public Integer nextInt() {
            nextToken();
            return (int)st.nval;
        }
        
        private int nextToken() {
            int token = st.TT_EOF;
            try {
                token = st.nextToken();
            } catch (IOException e) {
            }
            return token;
        }
    }
}