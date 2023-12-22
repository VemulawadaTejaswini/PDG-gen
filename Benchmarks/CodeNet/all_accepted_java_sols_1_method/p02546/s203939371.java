import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    
      	String str = sc.next();
            
      	if(!str.substring(str.length() - 1).equals("s")) {
        	System.out.println(str + "s");
        } else {
        	System.out.println(str + "es");        	
        }
    }
}