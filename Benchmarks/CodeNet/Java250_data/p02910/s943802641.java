import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      for(int i=0;i<s.length();i++){
      	if(i%2==0){
          if(!(s.charAt(i)=='R' || s.charAt(i)=='U' || s.charAt(i)=='D')){
          System.out.println("No");
          return;
          }
        }else{
            if(!(s.charAt(i)=='L' || s.charAt(i)=='U' || s.charAt(i)=='D')){
            System.out.println("No");
            return;
            }
        }
      }
        System.out.println("Yes");
    }
}