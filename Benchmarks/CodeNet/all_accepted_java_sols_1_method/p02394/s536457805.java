import java.util.Scanner;


class Main {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    String  s1 = sc.next();
	    int W = Integer.parseInt(s1);
	    String  s2 = sc.next();
	    int H = Integer.parseInt(s2);
	    String  s3 = sc.next();
	    int x = Integer.parseInt(s3);
	    String  s4 = sc.next();
	    int y = Integer.parseInt(s4);
	    String  s5 = sc.next();
	    int r = Integer.parseInt(s5);
	    String yn = "";
	    if( -100 <= x && x <= 100 ){
	    	if(-100 <= y && y <= 100 ){
	    		if(0 < W && W <= 100){
	    			if(0 < H && H <= 100){
	    				if(0 < r && r <= 100){
	                        if( x + r <= W && r <= x ){
	                            if( y + r <= H && r <= y ){
	                            	yn = "Yes";
	                            }
	                            else{
		        	                yn = "No";
	                            }
	                        }
	                        else{
	        	                yn = "No";
	                        }
	    			    }
	    			}
	    		}
	    	}
	    }
	    System.out.println( yn );
	}

}