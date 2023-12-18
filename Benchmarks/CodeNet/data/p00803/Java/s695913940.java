import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;
import java.lang.Object;
 
public class Main {
    Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        new Main(); 
    }
   
    public Main() {
        new aoj1216().doIt();
    }
    class aoj1216{	
    	int a[] = new int[101];
    	int b[] = new int[101];
    	void doIt(){
    		for(int i = 0;i < 101;i++)a[i] = i*i*i;
    		for(int i = 0;i < 101;i++)b[i] = i*(i+1)*(i+2)/6;
    		while(true){
    			int n = sc.nextInt();
    			if(n == 0)break;
    			int num = 0;
    			for(int i = 0;i < 101;i++){
    				for(int j = 0;j < 101;j++){
    					if(a[i]+b[j] <= n)num = Math.max(num,a[i]+b[j]);
    				}
    			}
    			System.out.println(num);
    		}
    	}
    }
}