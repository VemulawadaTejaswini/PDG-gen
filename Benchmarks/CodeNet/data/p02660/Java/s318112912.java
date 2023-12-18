import java.util.*;
public class Main{
  public static void main(String[] args){
  	Scanner sc=new Scanner(System.in);
    long N=sc.nextLong();
    long originalN=N;
    int turn=0;
    	for(int i=2;i<=(int)Math.sqrt(N)+1;i++){
      		if(N%i==0){
        		N=N/i;
                turn++;
            }
          if(N==1) break;
    	}
    
    if(originalN==N) turn=1;
    
    System.out.println(turn);
  }
}