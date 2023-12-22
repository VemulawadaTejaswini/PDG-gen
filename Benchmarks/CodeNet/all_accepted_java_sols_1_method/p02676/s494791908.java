import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int k=sc.nextInt();
    char[] s=sc.next().toCharArray();
    if(k>=s.length){
      for(int i=0;i<s.length;i++){
        System.out.print(s[i]);
      }
    }else{
      for(int i=0;i<k;i++){
        System.out.print(s[i]);
      }
      System.out.print("...");
    }
  }
}