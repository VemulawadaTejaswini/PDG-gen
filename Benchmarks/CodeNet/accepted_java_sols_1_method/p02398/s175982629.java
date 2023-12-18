import java.util.*;
import java.lang.*;
  
public class Main{
  public static void main(String[] args){
    Scanner stdIn=new Scanner(System.in);
    int i=0,count=0;
    int a=stdIn.nextInt();
    int b=stdIn.nextInt();
    int c=stdIn.nextInt();
    for(i=a;i<=b;i++){
	if (c%i==0){
	    count++;
	}
    }
    System.out.println(count);
  }
}

