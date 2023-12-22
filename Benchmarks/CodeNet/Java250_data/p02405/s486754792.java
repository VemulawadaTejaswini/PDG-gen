import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new TEST().doIt();
    }
    class TEST{
        void doIt(){
        	while(true){
        		int n = sc.nextInt();
        		int m = sc.nextInt();
        		if(n + m == 0)break;
        		for(int i = 0;i < n;i++){
        			for(int j = 0;j < m;j++){
        				if((i+j)%2 == 0)System.out.print("#");
        				else System.out.print(".");
        			}
        			System.out.println();
        		}
        		System.out.println();
        	}
        }
    }
}