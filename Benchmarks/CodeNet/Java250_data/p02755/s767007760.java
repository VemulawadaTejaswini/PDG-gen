import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int a,b,c=0;
  	a=sc.nextInt();
  	b=sc.nextInt();
  	for(int d=b*10;d<(b+1)*10;d+=1){
  		if((int)(d*0.08)==a){
  			c=d;
  			break;
  		}else{
  			c=-1;
  		}
  	}
  	System.out.print(c);
  }
}