import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a, b, c;
  	a = sc.nextInt();
  	b = sc.nextInt();
  	c = sc.nextInt();
  	
  	if((a == b)&&(a == c)){
      	System.out.println("No");
      	System.exit(0);
    }
  	if((a == b)||(a == c)||(b == c)){
     	System.out.println("Yes");
      	System.exit(0);
    }
  	System.out.println("No");
  	System.exit(0);
	}
}