import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long N = sc.nextLong();
 	long A = sc.nextLong();
 	long B = sc.nextLong();
  	long amari = N%(A+B);
  	long ans=0;
  	if(A==0){
      System.out.print("0");
      System.exit(0);
    }
     
  	ans = A * (N/(A+B));
  	if(amari<=A){
     ans += amari; 
    }else{
      ans += A;
    }
  
	System.out.print(ans);
	}
}