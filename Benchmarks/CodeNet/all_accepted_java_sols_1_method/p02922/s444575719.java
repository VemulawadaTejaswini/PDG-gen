import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int count = 0;
      if(b==1)System.out.println(0);
      else if(a >= b)System.out.println(1);
      else{
        count = 1;
        b -= a;
      	while(b > 0){
      		b -= a-1;
          	count++;
      	}
        System.out.println(count);
      }
    }
}
