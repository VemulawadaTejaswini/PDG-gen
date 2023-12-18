import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	    Scanner std = new Scanner(System.in);
	    while(true){
	    	int x = Integer.parseInt(std.next());
	    	int y = Integer.parseInt(std.next());
	    	if(x!=0 || y!=0){
	    		if(x>y){int temp = x;x=y;y=temp;}
	    		System.out.println(x+" "+y);
	    	}else{
	    		break;
	    	}
	    }
	}}