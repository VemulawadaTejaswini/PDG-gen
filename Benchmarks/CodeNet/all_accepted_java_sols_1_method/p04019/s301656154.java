import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int n =0;
    int s =0;
    int e =0;
    int w =0;
    
    for(int i=0; i<S.length(); i++){
      if(S.charAt(i)=='N')n++;
      else if(S.charAt(i)=='S')s++;
      else if(S.charAt(i)=='E')e++;
      else if(S.charAt(i)=='W')w++;
    }
    if(s>0&&n>0&&w==0&&e==0) {
			System.out.println("Yes");
			return;
		}
		if(s==0&&n==0&&w>0&&e>0) {
			System.out.println("Yes");
			return;
		}
		if(s>0&&n>0&&w>0&&e>0) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");
  }
}   