import java.awt.geom.Point2D;
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj1155().doIt();
    }
    class aoj1155{
    	ArrayList<Circle> cc = new ArrayList<Circle>();
    	boolean color[] = new boolean[5];
    	void set(){
    		for(int i = 0;i < 5;i++)color[i] = false;
    		cc.clear();
    	}
    	boolean Circle_check(int num,int length){
    		for(int i = 0;i < length;i++){
    			if(cc.get(i).color == num){
    				for(int j = i + 1;j < length;j++){
    					Point2D p1 = cc.get(i).p;
    					Point2D p2 = cc.get(j).p;
    					double rr = cc.get(i).dis + cc.get(j).dis;
    					double dis = p1.distance(p2);
    					if(dis < rr)return false;
    				}
    			}
    		}
    		return true;
    	}
    	int Circle_remove(int num,int length){
    		int result = 0;
    		for(int i = length - 1;i >= 0;i--){
    			if(cc.get(i).color == num){
    				cc.remove(i);
    				result++;
    			}
    		}
    		return result;
    	}
    	int ans(int n){
    		int result = 0;
    		for(int i = 1;i < 5;i++){
    			if(!color[i])continue;
    			for(int j = 1;j < 5;j++){
        			if(!color[j])continue;
        			if(Circle_check(j,cc.size())){
        				color[j] = false;
        				result = result + Circle_remove(j,cc.size());
        			}
        		}
    		}
    		return result;
    	}
    	void doIt(){
    		while(true){
    			int n = sc.nextInt();
    			if(n == 0)break;
    			set();
    			Circle[] c = new Circle[n];
    			for(int i = 0;i < n;i++){
    				Point2D p = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
    				cc.add(0,new Circle(p,sc.nextDouble(),sc.nextInt()));
    				color[cc.get(0).color] = true;
    			}
    			System.out.println(ans(n));
    		}
    	}
    	class Circle{
    		Point2D p;
    		double dis;
    		int color;
    		public Circle(Point2D p,double dis,int color){
    			this.p = p;
    			this.dis = dis;
    			this.color = color;
    		}
    	}
     }
}