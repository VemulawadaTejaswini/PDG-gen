import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
    	new C().doIt();
    }
    class C{
    	void doIt(){
    		int cnt = 1;
            while(true){
                int n = sc.nextInt();
                if(n == 0) break;
                double [] xlist = new double[n * 2];
                double [] ylist = new double[n * 2];
                Point2D [] Fplist = new Point2D[n * 2];
                Point2D [] Lplist = new Point2D[n * 2];
                for(int i = 0; i < n; i++){
                    double x = sc.nextDouble();
                    double y = sc.nextDouble();
                    double r = sc.nextDouble();
                    Fplist[i] = new Point2D.Double(x - r,y - r);
                    Lplist[i] = new Point2D.Double(x + r,y + r);
                    xlist[i * 2] = x - r;xlist[i * 2 + 1] = x + r;
                    ylist[i * 2] = y - r;ylist[i * 2 + 1] = y + r;
                }
                Arrays.sort(xlist);
                Arrays.sort(ylist);
                 
                boolean [][] map = new boolean[ylist.length -1][xlist.length -1];
                for(int i = 0; i < n; i++){
                	Point2D fp = new Point2D.Double(Arrays.binarySearch(xlist, Fplist[i].getX()),Arrays.binarySearch(ylist, Fplist[i].getY()));
                	Point2D lp = new Point2D.Double(Arrays.binarySearch(xlist, Lplist[i].getX()),Arrays.binarySearch(ylist, Lplist[i].getY()));
//                    System.out.println(fx+" "+lx+" "+fy+" "+ly);
                    for(int j = (int)fp.getY(); j < (int)lp.getY(); j++){
                        for(int k = (int)fp.getX(); k < (int)lp.getX(); k++){
                            map[j][k] = true;
                        }
                    }
                }
                double ans = 0.0;
                for(int i = 0; i < map.length; i++){
//                	System.out.println(map.length+" "+map[i].length);
                    for(int j = 0; j < map[i].length; j++){
                        if(map[i][j]){
                            double X = xlist[j + 1] - xlist[j];
                            double Y = ylist[i + 1] - ylist[i];
//                            System.out.println(xlist[j + 1]+" "+xlist[j]+" "+ylist[i + 1]+" "+ylist[i]);
                            double area = X * Y;
                            ans += area;
                        }
                    }
//                    System.out.println();
                }
                
                
//                for(int i = 0; i < map.length; i++){
//                    for(int j = 0; j < map[i].length; j++){
//                    	System.out.print(map[i][j] ? 0:1);
//                    }
//                    System.out.println();
//                }
                System.out.printf("%d %.2f\n",cnt++, ans);
            }
        }
    }
}