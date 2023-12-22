import java.util.*;

public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int ans = -1;

    for (int i=1; i<1010; i++) {
    	if ( (int) ((int)i *0.08) == A && (int)((int) i *0.1) == B) {
    		ans = i;
    		break;
    	}
    }

	System.out.println(ans);
    
  }
}