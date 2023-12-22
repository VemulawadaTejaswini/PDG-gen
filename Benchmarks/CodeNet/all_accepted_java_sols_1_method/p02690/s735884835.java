import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long x=sc.nextLong();
  	long i=0,j=0;
  	
  	for(long a=0;a<1000;a++){
  		for(long b=-1000;b<a;b++){
  			if((long)(Math.pow(a,5)-Math.pow(b,5))==x){
  				i=a;
  				j=b;
  				break;
  			}
  		}
  	}
  	System.out.print( i + " " + j );
  }
}