import java.util.*;
import java.lang.*;
  
public class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    int i=0,x=stdIn.nextInt(),y=stdIn.nextInt();
    while(x!=0||y!=0){
	if (x>y){
	    System.out.println(y+" "+x);
	}else{
	    System.out.println(x+" "+y);
	}
	x=stdIn.nextInt();y=stdIn.nextInt();
    }
  }
}

