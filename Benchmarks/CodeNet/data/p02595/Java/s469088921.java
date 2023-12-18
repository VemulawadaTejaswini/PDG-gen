import java.util.*;
import java.lang.Math;
 
public class Main{
  public static void main(String args[]){
  	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int x, y, p=0;
    for(int i = 0; i < n ; i++){
    	x = sc.nextInt();
      	y = sc.nextInt();
      	if(x*x+y*y <= d*d)
        	p++;
    }
    System.out.println(p);
  }
}