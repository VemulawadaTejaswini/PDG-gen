import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner x =new Scanner(System.in);
      	int size=x.nextInt();
      	int max=x.nextInt();
      	int count=0;
      	while(size-->0)
        {
          int a=x.nextInt();
          int b=x.nextInt();
          if(a^2+b^2<=max^2){
            count++;
          }
        }
      	System.out.println(count);
	}
}