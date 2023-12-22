import java.util.*;


		       public class Main {

		           public static void main(String args[])  {
		        	   Scanner sc =new Scanner(System.in);
		        	   long start =sc.nextLong();
		        	   long parm = sc.nextLong();
		        	   long remainder = start%parm;
		        	   System.out.println(Math.min(remainder,Math.abs(remainder -parm)));
		        	   
		        	   
		           }
		       }
