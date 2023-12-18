import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;  
/**
 * @author Chen Qiu, email:m5222104@u-aizu.ac.jp
 *@version : 2019/April
 */
public class Main {   
	static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	Point[] ch;
	Point[] p ;
	int n;  
	int len=0;  
	public Main(Point[] p,int n){  
	   this.p=p;  
	   this.n=n;  
	   ch= new Point[n];   
	}
	public  double multiply(Point p1, Point p2, Point p0) {   
	    return ((p1.x - p0.x) * (p2.y - p0.y) - (p2.x - p0.x) * (p1.y - p0.y));   
	}   
    public  double distance(Point p1, Point p2) {   
        return (Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y)   
                * (p1.y - p2.y)));   
    }   
  
    public void answer(){  

    }  
  
    public  int Graham_scan() {   
        int k = 0, top = 2;   
        Point tmp;      
        for (int i = 1; i < n; i++)   
        	if ((p[i].y < p[k].y) || ((p[i].y == p[k].y) && (p[i].x < p[k].x)))   
        		k = i;   
	        tmp = p[0];   
	        p[0] = p[k];   
	        p[k] = tmp;    
		for (int i = 1; i < n - 1; i++) {   
		    k = i;   
		    for (int j = i + 1; j < n; j++)   
		        if ((multiply(p[j], p[k], p[0]) > 0)|| ((multiply(p[j], p[k], p[0]) == 0) && (distance(p[0], p[j]) < distance(p[0], p[k]))))   
		            k = j; 
            tmp = p[i];   
            p[i] = p[k];   
            p[k] = tmp;   
		}   
		ch[0] = p[0];   
        ch[1] = p[1];   
        ch[2] = p[2];   
		for (int i = 3; i < n; i++) {   
            while (top > 0 && multiply(p[i], ch[top], ch[top - 1]) >= 0)   
                top--;    
	        ch[++top] = p[i];   
	    }   
	    len=top+1;
	    out.println(len);
	    out.flush(); 
    	for (int i=0;i<len;i++) {
            out.println(ch[i].x+" "+ch[i].y); 
            out.flush(); 
		}
	    return len;   
}   
 
public static void main(String[] args) throws IOException  {     
    in.nextToken();
    int points;
    points=(int)in.nval;
    in.nextToken();  
    Point[] p = new Point[points]; 
    for(int i=0;i<points;i++){ 	
        int x = (int) in.nval;
        in.nextToken();
        int y = (int) in.nval;
        if (i!=points-1) {
        	in.nextToken();
		}
        p[i] = new Point(x, y);   
    }
    out.flush();    
    Main ma=new Main(p,points);   
    ma.Graham_scan();  
    out.flush();     
}   
  
}   
class Point {   
    int x;   
    int y;   
  
    public Point(int x, int y) {   
       this.x = x;   
       this.y = y;   
    }   
 }   
  

