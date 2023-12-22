import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   	String s = sc.next();
    int count = 0;
    int istack = 0;
    int count_min;
    
    if(s.charAt(0) == 'E') istack = 1;
    for(int i = 0;i < n;i++){
      if(s.charAt(i) == 'E') count++;
    }
    count_min = count-istack;
    for(int i = 0; i < n-1;i++){
      istack = 0;
      if(s.charAt(i+1) == 'E') istack = 1;
      if(s.charAt(i) == 'E') count--;
      else count++;
      if(count-istack < count_min) count_min = count-istack;
    }
  	System.out.println(count_min);
    
    
  }
}
