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
      	double z = Math.sqrt(x*x + y*y);
      	int k = (int)z + (z%(2.0)!=0.0); 
      	if(z <= d)
        	p++;
    }
    System.out.println(p);
  }
}