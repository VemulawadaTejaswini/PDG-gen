import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      String S = sc.next();
      int r = 0;
      int l = 0;
      for(int i=1;i<S.length();i++){
        if(S.charAt(i)=='E'){
          r++;
        }
      }
      int min = r+l;
      int count = 0;
      for(int i=1;i<N;i++){
        if(S.charAt(i-1)=='W'){
          l++;
        }
        if(S.charAt(i)=='E'){
          r--;
        }
        count = l+r;
        min = Math.min(min,count);
      }
      System.out.println(min);
    }
}