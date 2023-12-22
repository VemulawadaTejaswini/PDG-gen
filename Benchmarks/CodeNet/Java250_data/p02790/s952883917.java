import java.util.*;
import java.lang.Math;

public class Main {
public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
	
  int a,b,loop;
  
  a = sc.nextInt();
  b = sc.nextInt();
  loop = 0;
  
  if (a > b) {
    loop = a;
    
     for(int i = 0; i < loop; i++) {
     	System.out.print(b); 
    }
    
  } else {
    loop = b; 
    
      for(int i = 0; i < loop; i++) {
     	System.out.print(a); 
    }
    
  }
  
	}
}