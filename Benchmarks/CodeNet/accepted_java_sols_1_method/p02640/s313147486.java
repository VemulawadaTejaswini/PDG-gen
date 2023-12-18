import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
      	int x = sc.nextInt();
        int y = sc.nextInt();
      	int t;
      	int k;
      	boolean coj = false;
      
      	if(y % 2 == 0){
          t = y/2;
          k = y/4;
          if(y % 4 != 0)k++;
          if(t >= x && x >= k) coj = true;
        }
          
      	if(coj) System.out.println("Yes");
      	else System.out.println("No");
      
	}
}