import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           int c=0;
           String str=sc.next();
           if(str.contains("RRR"))
        	   System.out.println("3");
           else if(str.contains("RR"))
        	   System.out.println("2");
           else if(str.contains("R"))
        	   System.out.println("1");
           else
        	   System.out.println("0");
	}

}
