import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long n,k;
  	n=sc.nextLong();
  	k=sc.nextLong();
  	int f=0;
  	while(f==0){
  		if(n>k){
  			n%=k;
  		}else{
  			if(n<=k-n){
  				break;
  			}else{
  				n=k-n;
  				break;
  			}
  		}
  	}
  	System.out.print(n);
  }
}