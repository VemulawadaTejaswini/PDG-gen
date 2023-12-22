import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String N = sc.next();
      long sum = 0;
      for(int i=0;i<N.length();i++){
        String s = N.substring(i,i+1);
        int n = Integer.parseInt(s);
        sum+=n;
        sum%=9;
      }
      if(sum==0){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}