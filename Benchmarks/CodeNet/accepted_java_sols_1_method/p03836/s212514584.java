import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);
		    
		    int sx = sc.nextInt();
		    int sy = sc.nextInt();
		    int tx = sc.nextInt();
		    int ty = sc.nextInt();
		    
		    int yoko = tx -sx;
		    int tate = ty -sy;
		    
		    for(int i = 0; i<yoko; i++) {
		    	System.out.print("R");
		    }
		    for(int i = 0; i<tate; i++) {
		    	System.out.print("U");
		    }
		    for(int i = 0; i<yoko; i++) {
		    	System.out.print("L");
		    }
		    for(int i = 0; i<tate + 1; i++) {
		    	System.out.print("D");
		    }
		    for(int i = 0; i<yoko + 1; i++) {
		    	System.out.print("R");
		    }
		    for(int i = 0; i<tate + 1; i++) {
		    	System.out.print("U");
		    }
		    System.out.print("L");
		    System.out.print("U");
		    for(int i = 0; i<yoko + 1; i++) {
		    	System.out.print("L");
		    }
		    for(int i = 0; i<tate + 1; i++) {
		    	System.out.print("D");
		    }
		    System.out.print("R");
		    sc.close(); }
		  }