import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char[] n = N.toCharArray();
      
        for(int i = 0; i < n.length; i++){
          if(n[i] == '7'){
            System.out.println("Yes");
            return;
          }
        }
        System.out.println("No");
	}
}