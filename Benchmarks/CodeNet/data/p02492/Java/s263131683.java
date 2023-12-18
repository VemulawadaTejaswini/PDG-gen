import java.util.Scanner;
public class Main{
	private static Scanner sc;
	public static void main(String[] args){
	    sc = new Scanner(System.in);
	    while(true){
	    String str = sc.next("-?\\d*\\.?\\d+[+-/*]-?\\d*\\.?\\d+");
	    String[] xyStr = str.split("[+-/*]");
	    int x = (int) Float.parseFloat(xyStr[0]);
	    int y = (int) Float.parseFloat(xyStr[1]);
	    int r = 0;
	    char opt = '+';
	    if(str.contains("+")){
	        opt = '+';
	        r = x + y;
	    }else if(str.contains("-")){
	        opt = '-';
	        r = x - y;
	    }else if(str.contains("*")){
	        opt = '*';
	        r = x * y;
	    }else if(str.contains("/")){
	        opt = '/';
	        r = x / y;
	    }else if(str.contains("?")){
	    	break;
	    }
	    System.out.println(x+""+opt+y+"="+r);
	}
	}
}