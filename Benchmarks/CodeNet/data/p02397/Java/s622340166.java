package Main;

import java.util.*;
class Main{
	private static Scanner sc;
    static int x;
    static int y;

	public static void main(String[]agrs){
		sc = new Scanner(System.in);
        int m=0;
    	x=sc.nextInt();
	    y=sc.nextInt();
		   System.out.println();
		while(m==0){
		    if(0==x&&0==y)break;
	
			if(x>y){
				System.out.println(y+" "+x);
			}else if(y>x){
				System.out.println(x+" "+y);
			}else{
				System.out.println(x+" "+y);
			}
			x=sc.nextInt();
		    y=sc.nextInt();
		}
		
		
		
	}
}