import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),f=0;
  	for(int i=a;i<=b;i++){
  		if(i%n==0){
  			f++;
  			System.out.print("OK");
  			break;
  		}
  	}
  	if(f==0){
  		System.out.print("NG");
  	}
  }
}