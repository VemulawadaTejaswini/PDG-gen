import java.util.*;

class Main{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    
    int [] s = new int[n];
    int t = 0;
    
    for (int i = 0; i < n; i++){
      s[i] = sc.nextInt();
      t += s[i];
    }
        
		if(h <= t){
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
  }
}
    
    