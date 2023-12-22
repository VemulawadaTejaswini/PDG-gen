import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
      int N = sc.nextInt();
      String s = sc.next();
      int rcount = 0;
      int bcount = 0;
      for(int i=0;i<N;i++){
        if(s.charAt(i)=='R'){
          rcount++;
        }else{
          bcount++;
        }
      }
      if(rcount>bcount){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
}