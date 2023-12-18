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
        new aoj1237().doIt();
    }
    class aoj1237{
    	int length = 0;
    	int n = 0;
    	int not = 0;
    	int max = 0;
    	ArrayList<Integer> ar = new ArrayList<Integer>();
    	ArrayList<Integer> ans = new ArrayList<Integer>();
    	void dfs(int deep,int array[],int num){
    		if(deep == length){
    			if(num <= n){
    				if(max < num){
    					ans.clear();
    					for(int i = 0;i < ar.size();i++)ans.add(ar.get(i));
    					max = num;
    					not = 0;
    				}
    				else if(max == num)not++;
    			}
    		}else{
    			int cnt = 0;
    			for(int i = deep;i < length;i++){
        			cnt = cnt * 10 + array[i];
        			ar.add(cnt);
        			dfs(i+1,array,num + cnt);
        			ar.remove(ar.size() - 1);
        		}
    		}
    	}
    	void doIt(){
    		while(true){
    			max = 0;
    			n = sc.nextInt();
    			String str = sc.next();
    			length = str.length();
    			int num = Integer.parseInt(str);
    			if(n + num == 0)break;
    			int array[] = new int[length];
    			for(int i = length-1;i >= 0;i--){
    				array[i] = num % 10;
    				num = num / 10;
    			}
    			dfs(0,array,0);
    			if(not > 0)System.out.println("rejected");
    			else if(max == 0)System.out.println("error");
    			else{
    				System.out.print(max);
    				for(int i = 0;i < ans.size();i++)System.out.print(" "+ans.get(i));
    				System.out.println();
    			}
    		}
    	}
    }
}