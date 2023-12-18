import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int n = s.length();
      int k = n;
      for(int i = 0;i < n;i++){
        if(s.charAt(i)=='C'){
          k=i;
          break;
        }
      }
      for(int j = k;j < n;j++)
        if(s.charAt(j)=='F'){
          System.out.println("Yes");
          return;
        }
      System.out.println("No");
    }
}