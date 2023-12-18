import java.io.*;
import java.util.Scanner;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int ang = 0;
		 int each = 0;
		 int flag = 0;
		 int more = 0;
		 Scanner in = new Scanner(System.in);
		 ang = in.nextInt();
	     judge(ang);
	     in.close();
	}
	
	public static void judge(int ang){
	    int each = 0;
		int flag = 0;
		int more = 0;
	    if(ang>=1 && ang<=45){
	        each = 360/ang;
	        flag = 360%ang;
	        if(flag != 0){
	             more = ang*16 - 360;
	             if(more > 180){
	                 more = 360 - more;
	             }
	             judge(more);
	         }else{
	             System.out.println(each);
	         }
	    }else if (ang>45 && ang<=90){
	        each = 360/ang;
	        flag = 360%ang;
	        if(flag != 0){
	             more = ang*8 - 360;
	             if(more > 180){
	                 more = 360 - more;
	             }
	             judge(more);
	         }else{
	             System.out.println(each);
	         }
	    } else if (ang>90 && ang<=135){
	        each = 360/ang;
	        flag = 360%ang;
	        if(flag != 0){
	             more = ang*4 - 360;
	             if(more > 180){
	                 more = 360 - more;
	             }
	             judge(more);
	         }else{
	             System.out.println(each);
	         }
	    } else if (ang>135 && ang<=179){
	        each = 360/ang;
	        flag = 360%ang;
	        if(flag != 0){
	             more = ang*2 - 360;
	             if(more > 180){
	                 more = 360 - more;
	             }
	             judge(more);
	         }else{
	             System.out.println(each);
	         }
	    } else{
	        System.out.println("no");
	    }
	}
}