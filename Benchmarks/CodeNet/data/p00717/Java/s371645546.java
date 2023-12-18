
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.io.IOException;
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj1136().doIt();
    }
    class aoj1136{
    	Point2D pp[] = new Point2D [10];
    	Point2D pprev[] = new Point2D [10];
    	Point2D pprotate[][] = new Point2D[8][10];
    	Point2D ppset[][] = new Point2D[51][10];

    	int mx[] = {1,0,-1,0};
    	int my[] = {0,1,0,1};
    	void set(int m){
//    		System.out.println("set");
    		Point2D p = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
			for(int i = 0;i < m;i++){
				Point2D p2 = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
				pp[i] = new Point2D.Double(p2.getX() - p.getX(),p2.getY() - p.getY());
//				System.out.println(pp[i].getX()+" "+pp[i].getY());
				p = p2;
			}
			for(int i = 0;i < m;i++){
				pprev[i] = pp[m-i-1];
//				System.out.println(pprev[i].getX()+" "+pprev[i].getY());
			}
    	}
    	void set2(int num){
//    		System.out.println("set");
    		int m = sc.nextInt();
    		Point2D p = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
			for(int i = 0;i < m-1;i++){
				Point2D p2 = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
				ppset[num][i] = new Point2D.Double(p2.getX() - p.getX(),p2.getY() - p.getY());
//				System.out.println(ppset[num][i].getX()+" "+ppset[num][i].getY());
				p = p2;
			}
    	}
    	void rot(int m){
    		for(int i = 0;i < 4;i++){
//    			System.out.println("rotate");
    			for(int j = 0;j < m;j++){
    				pprotate[i][j] = new Point2D.Double(pp[j].getX()*mx[i]+pp[j].getY()*my[i],pp[j].getY()*mx[i]+pp[j].getX()*my[i]);
    				if(i == 1)pprotate[i][j] = new Point2D.Double(-pprotate[i][j].getX(),pprotate[i][j].getY());
    				if(i == 3)pprotate[i][j] = new Point2D.Double(pprotate[i][j].getX(),-pprotate[i][j].getY());
//    				System.out.println(pprotate[i][j].getX()+" "+pprotate[i][j].getY());
    			}
    		}
    		for(int i = 0;i < 4;i++){
//    			System.out.println("rotate");
    			for(int j = 0;j < m;j++){
    				pprotate[4+i][j] = new Point2D.Double(pprev[j].getX()*mx[i]+pprev[j].getY()*my[i],pprev[j].getY()*mx[i]+pprev[j].getX()*my[i]);
    				if(i == 1)pprotate[4+i][j] = new Point2D.Double(-pprotate[4+i][j].getX(),pprotate[4+i][j].getY());
    				if(i == 3)pprotate[4+i][j] = new Point2D.Double(pprotate[4+i][j].getX(),-pprotate[4+i][j].getY());
//    				System.out.println(pprotate[4+i][j].getX()+" "+pprotate[4+i][j].getY());
    			}
    		}
    	}
    	void ans(int n,int m){
    		for(int i = 0;i < 8;i++){
    			boolean ok = true;
    			for(int j = 0;j < m;j++){
    				if(pprotate[i][j].getX() != ppset[n][j].getX()
    						|| pprotate[i][j].getY() != ppset[n][j].getY()){
    					ok = false;
    					break;
    				}
    			}
    			if(ok){
    				System.out.println((n+1));
    				return;
    			}
    		}
    	}
    	void doIt(){
    		while(true){
    			int n = sc.nextInt();
    			if(n == 0)break;
    			int m = sc.nextInt()-1;
    			set(m);
    			rot(m);
    			for(int i = 0;i < n;i++)set2(i);
    			for(int i = 0;i < n;i++)ans(i,m);
    			System.out.println("+++++");
    		}
    	}
    }
}