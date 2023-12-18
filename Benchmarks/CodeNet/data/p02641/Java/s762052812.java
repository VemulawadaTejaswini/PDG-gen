import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int n = sc.nextInt();

      Set<Integer> set = new HashSet<>();
      for(int i = 0; i < n; i++)
      	set.add(sc.nextInt());
	  
	  int left = x;
	  int right = x;      
	  while(true) {
	  	if(!set.contains(left) || !set.contains(right)) {
	  		if(!set.contains(left) && !set.contains(right)) {
	  			System.out.println(left);
	  		} else if(!set.contains(left)) {
	  			System.out.println(left);
	  		} else
	  			System.out.println(right);
	  		return;
	  	}
	  	left--;
	  	right++;
	  }
      
      
  }
}