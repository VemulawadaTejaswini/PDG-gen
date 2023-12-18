import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
	    while(true){
	 	    int a = Integer.parseInt(std.next());
	 	    String op = std.next();
	 	    int b = Integer.parseInt(std.next());
	    	if(op!="?"){
	    		int res = 0;
	    		switch(op){
	    		case "+" : res = a+b; break;
	    		case "-" : res = a-b; break;
	    		case "*" : res = a*b; break;
	    		case "/" : res = a/b; break;
	    		}
	    		System.out.println(res);
	    	}else break;
	    }
	}
}