import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
     	long a = sc.nextLong();
      	long b = sc.nextLong();
      	long x = sc.nextLong();
      	long aa = a/x;
      	long bb = b/x;
      	if(a%x==0) System.out.println(bb-aa+1);
    	else System.out.println(bb-aa);
    }
}