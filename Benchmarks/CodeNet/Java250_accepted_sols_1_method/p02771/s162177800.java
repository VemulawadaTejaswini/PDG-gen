import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int[] x=new int[10];
    	boolean can = true;
    	for(int i=0;i<3;i++) {
    		x[sc.nextInt()]++;
    	}
    	for(int i=0;i<10;i++) {
    		if(x[i]==2) {
    			can = false;
    			break;
    		}
    	}
    	String s = can?"No":"Yes";
    	System.out.println(s);
	}
}