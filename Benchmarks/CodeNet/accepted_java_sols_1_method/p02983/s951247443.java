import java.util.*;
public class Main{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      long l = sc.nextLong();
      long r = sc.nextLong();
      long min = 10000;
      if(r-l >= 2019){
        System.out.println(0);
        return;
      }
      else{
      	for(long i = l;i <= r-1;i++){
        	for(long j = i+1;j <= r;j++){
            	min = Math.min(min,(i*j)%2019);
            }
        }
      }
      System.out.println(min);
	}
} 
