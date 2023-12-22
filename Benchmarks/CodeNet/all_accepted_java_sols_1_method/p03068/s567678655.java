import java.util.*;

class Main
{
  	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String as= sc.next();
      char[] s = as.toCharArray();
      int k = sc.nextInt();
      for(int i=0; i<n; i++){
          if(s[i] != s[k-1]){
            s[i]='*';		
          }
          System.out.print(s[i]);
      }
    }
	
}
