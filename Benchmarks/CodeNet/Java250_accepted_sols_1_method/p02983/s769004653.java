import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  long L = sc.nextLong();
	  long R = sc.nextLong();
	  long ans = 2020;
	  boolean isZero = false;
	  
	  //2019の倍数があるか調べる
	  for(long i=L; i<=R; i++) {
		  if ( i %2019 == 0) {
			  isZero =true;
			  break;
		  }
	  }
	  if(!isZero) {
	  //なかった場合は全探索。最大でも2018*2017/2回で済む？
	  for(long i=L; i<R; i++) {
		  for(long j = i+1; j<=R; j++) {
			  long x = (i * j) %2019;
			  if(ans > x) ans = x;
		  }
	  }
	  }
	  
	  if(isZero) out.println(0);
	  else out.println(ans);
	  
  	}
  }	  