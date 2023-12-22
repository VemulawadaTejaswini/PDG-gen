import java.util.Scanner;

   class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String a=sc.next();
    	String b=sc.next();
    	if((a.equals("H") && b.equals("H")) || (a.equals("D") && b.equals("D"))) {
    		System.out.println("H");
    		System.exit(0);
    	}
    	else{
    		System.out.println("D");
    		System.exit(0);
    	}
    }
}