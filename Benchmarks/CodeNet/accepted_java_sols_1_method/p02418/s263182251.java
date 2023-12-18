import java.util.Scanner;

class Main{
       public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	String s = scan.next();
    	String p = scan.next();
    	String ss = s + s;
    	
    	if(ss.indexOf(p) != -1){
    		System.out.println("Yes");
    	}else{
    		System.out.println("No");
    	}
     }
    	
}