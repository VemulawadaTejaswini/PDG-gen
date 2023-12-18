
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Main {
	 static List<Point> points = new ArrayList<Point>();
	 static List<Point> hull;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int n = (int)sc.nextLong();
			points.clear();
			if(n == 0) break;
			for(int i = 0; i < n; i++) {
				String[] tmp = sc.next().split(",");
				double x = Double.parseDouble(tmp[0]);
				double y = Double.parseDouble(tmp[1]);
				
				Point p = new Point(x,y);
				points.add(p);
				
			}
			createConvexHull();
			out.println((points.size() - hull.size() + 2));
		}
		
		out.flush();
	}
	   
    static double getSignedArea(Point p1, Point p2, Point p3){
        return (p2.x - p1.x) * (p3.y - p1.y) 
                - (p3.x - p1.x) * (p2.y - p1.y);
    }
    static void createConvexHull(){
        //X??§?¨???§????????????
        Collections.sort(points, new Comparator<Point>() {
            public int compare(Point o1, Point o2) {
            	if(o1.x < o2.x) return -1;
            	else if(o1.x > o2.x) return 1;
            	return 0;
            }
        });
        
        //??????????±???????
        hull = new ArrayList<Point>();
        List<Point> proc = hull;
        for(int k = 0; k < 2; ++k){
            //1????????§?????´???2????????§?????´??????????????????
            proc.add(points.get(0));
            proc.add(points.get(1));
            for(int i = 2; i < points.size(); ++i){
                Point p = points.get(i);
                for(;;){
                    Point q1 = proc.get(proc.size() - 2);
                    Point q2 = proc.get(proc.size() - 1);
                    double s = getSignedArea(q1, q2, p);
                    if(k == 0){
                        if(s < 0) break;
                    }else{
                        if(s > 0) break;
                    }
                    proc.remove(proc.size() - 1);
                    if(proc.size() < 2) break;
                }
                proc.add(p);
            }
            if(k == 0) proc = new ArrayList<Point>();
        }

        //????????????
        for(int i = 0; i < proc.size(); ++i){
            hull.add(proc.get(proc.size() - i - 1));
        }
    }
	

}
//------------------------------//
//-----------//
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    

}

class Point {
	Double x;
	Double y;
	Point(double a, double b) {
		x = a;
		y = b;
	}
}