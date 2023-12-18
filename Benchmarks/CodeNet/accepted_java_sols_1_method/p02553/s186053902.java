import java.util.*;
    public class Main{
    	public static void main(String[] args){
        	Scanner s  = new Scanner(System.in);
          	long a = s.nextLong();
          	long b = s.nextLong();
          	long c = s.nextLong();
          	long d = s.nextLong();
          	//long res=  1;
            long a1 = a*c;
            long a2 = b*d;
            long a3 = a*d;
          	long a4 = b*c;
          	long res1 = Math.max(a1,a2);
          	long res2 = Math.max(a3,a4);
          	long res = Math.max(res1,res2);
          	System.out.println(res);
        }
    }