import java.awt.geom.Point2D;
import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        new Main(); 
    }
 
    public Main() {
    	while(sc.hasNext()){
    		new aoj0036().doIt();
    	}
    }
    class aoj0036{
    	String check(int a[][],int y,int x,String s){
    		if(a[y][x]+a[y][x+1]+a[y+1][x]+a[y+1][x+1] == 4){
    			return "A";
    		}else if(a[y][x]+a[y+1][x]+a[y+2][x]+a[y+3][x] == 4){
    			return "B";
    		}else if(a[y][x]+a[y][x+1]+a[y][x+2]+a[y][x+3] == 4){
    			return "C";
    		}else if(a[y][x+1]+a[y+1][x]+a[y+1][x+1]+a[y+2][x] == 4){
    			return "D";
    		}else if(a[y][x]+a[y][x+1]+a[y+1][x+1]+a[y+1][x+2] == 4){
    			return "E";
    		}else if(a[y][x]+a[y+1][x]+a[y+1][x+1]+a[y+2][x+1] == 4){
    			return "F";
    		}else if(a[y][x+1]+a[y][x+2]+a[y+1][x]+a[y+1][x+1] == 4){
    			return "G";
    		}
    		return s;
    	}
    	void doIt(){
    		int a[][] = new int [12][12];
    		String s = "";
    		for(int i = 0;i < 8;i++){
    			String str = sc.next();
    			char ctr[] = str.toCharArray();
    			for(int j = 0;j < 8;j++){
    				a[i][j] = Integer.parseInt(""+ctr[j]);
    			}
    		}
    		for(int i = 0;i < 8;i++){
    			for(int j = 0;j < 8;j++){
    				s = check(a,i,j,s);
    			}
    		}
    		System.out.println(s);
    	}
    }
}