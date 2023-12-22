import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int max = 0;
      //１文字目始まりから探す
      for(int i=0;i<s.length();i++){
        int count = 0;
        for(int j=i;j<s.length();j++){
          if(s.charAt(j)=='A' || s.charAt(j)=='C' || s.charAt(j)=='G' || s.charAt(j)=='T'){
            count++;
          }else{
            break;
          }
        }
        max = Math.max(max,count);
      }
      System.out.println(max);
    }
}