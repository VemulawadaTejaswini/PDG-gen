import java.util.*;
import java.lang.*;

class main{
  public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
	    int a0 = sc.nextInt();
	    double a = (double)a0;
	    double a2 = Math.pow(a0,2);
	    double a3 = Math.pow(a0,3);
	    int answer = (int)(a + a2 + a3);
	    System.out.println(answer);	    
	    sc.close();
  }
  }